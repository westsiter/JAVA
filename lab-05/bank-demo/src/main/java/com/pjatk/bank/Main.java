package com.pjatk.bank;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args){

        /**
         * Utwórzmy kilka przykładowych kont bankowych
         */
        String accountNumber1 = "PL 19 1240 6957 6648 5356 2227 1000";
        String accountNumber2 = "PL 96 1030 1090 1009 2214 7993 1993";
        String accountNumber3 = "PL 95 9279 0007 4775 7001 9528 9787";

        /**
         * Utwórz klasę 'BankAccount' która ma konstruktor
         * uzupełaniający pole numeru bankowego 'accountNumber'
         */
        BankAccount kontoJanusza = new BankAccount(accountNumber1);
        BankAccount kontoZdzislawa = new BankAccount(accountNumber2);
        BankAccount kontoGrazyny = new BankAccount(accountNumber3);

        /**
         * Utwórz klasę 'BankAccountManager', która będzie zarządzać kontami bankowymi,
         * oraz wykonwyać różne operacje na nich
         */
        BankAccountManager bankAccountManager = new BankAccountManager();

        /**
         * obiekt klasy 'BankAccountManager' powinien mieć metodę
         * dodawania kont bankowych do kolekcji, którą będzie zarządzać
         */
        bankAccountManager.addAccount(kontoGrazyny);
        bankAccountManager.addAccount(kontoJanusza);
        bankAccountManager.addAccount(kontoZdzislawa);

        /**
         * utwórz klasę 'BankAccountOperation', która będzie definiować typ operacji
         * na kontach bankowych.
         *
         * Klasa powinna mieć konstruktor,
         * który jako wartość przyjmuje wartość typu wyliczeniowego enum 'BankOperationType':
         *  - DEPOSIT
         *  - WITHDRAWAL
         *  - TRANSFER
         */
        BankAccountOperation depositJanusza = new BankAccountOperation(BankOperationType.DEPOSIT);


        /**
         * Depozyt:
         * -> określamy na które konto wpłacamy środki,
         * -> okreslamy ilość pieniedzy
         * -> określamy date i czas wpłaty środków
         */

        depositJanusza.setSourceBankAccount(kontoJanusza);
        depositJanusza.setMoney(1000.00);
        depositJanusza.setDate(LocalDateTime.now());

        BankAccountOperation depositGrazyny = new BankAccountOperation(BankOperationType.DEPOSIT);
        depositGrazyny.setSourceBankAccount(kontoGrazyny);
        depositGrazyny.setMoney(1300);
        depositGrazyny.setDate(LocalDateTime.now());

        BankAccountOperation depositZdzislawa = new BankAccountOperation(BankOperationType.DEPOSIT);
        depositZdzislawa.setSourceBankAccount(kontoZdzislawa);
        depositZdzislawa.setMoney(900);
        depositZdzislawa.setDate(LocalDateTime.now());


        /**
         * Zdefiniowane wpłaty środków rejestrujemy
         * w obiekcie do zarządzania kontami
         */
        bankAccountManager.registerOperation(depositGrazyny);
        bankAccountManager.registerOperation(depositJanusza);
        bankAccountManager.registerOperation(depositZdzislawa);

        /**
         * obiekt zarządzający ma wykonać wpłaty środków na konta
         * -> tutaj ma nastąpić zmiana wartości pieniężnych na kontach
         */
        bankAccountManager.performDeposits();

        /**
         * wyświetlamy aktualne stany kont
         */
        System.out.println("======== Wpłaty ========");
        System.out.println("Stan konta  Janusza: " +  kontoJanusza.getMoney());
        System.out.println("Stan konta  Grazyny: " +  kontoGrazyny.getMoney());
        System.out.println("Stan konta  Zdzislawa: " +  kontoZdzislawa.getMoney());

        /**
         * Definiujemy wypłaty środków
         */
        BankAccountOperation wyplataSrodkowJanusza = new BankAccountOperation(BankOperationType.WITHDRAWAL);
        wyplataSrodkowJanusza.setMoney(200);
        wyplataSrodkowJanusza.setDate(LocalDateTime.now());
        wyplataSrodkowJanusza.setSourceBankAccount(kontoJanusza);

        /**
         * rejestrujemy operacje wypłat środków w obiekcie zarządzającymi kontami
         */
        bankAccountManager.registerOperation(wyplataSrodkowJanusza);

        /**
         * obiekt zarządzającymi kontami ma wykonać wypłaty środków
         * -> tutaj ma nastąpić zmiana wartości pieniężnych na kontach
         */
        bankAccountManager.performWithdrawals();


        /**
         * wyświetlamy aktualne stany kont
         */
        System.out.println("======== Wypłaty ========");
        System.out.println("Stan konta  Janusza: " +  kontoJanusza.getMoney());


        /**
         * Definiujemy transfery sródków z konta Janusza na konto Grazyny,
         * który został dziś zlecony
         */
        BankAccountOperation transferOdJanuszadoGrazyny = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdJanuszadoGrazyny.setSourceBankAccount(kontoJanusza);
        transferOdJanuszadoGrazyny.setTargetBankAccount(kontoGrazyny);
        transferOdJanuszadoGrazyny.setDate(LocalDateTime.now());
        transferOdJanuszadoGrazyny.setMoney(120);

        /**
         * Definiujemy transfery sródków z konta Grazyny na konto Zdzislawa,
         * który został zlecony na jutro
         */
        BankAccountOperation transferOdGrazynyDoZdzislawa = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdGrazynyDoZdzislawa.setSourceBankAccount(kontoGrazyny);
        transferOdGrazynyDoZdzislawa.setTargetBankAccount(kontoZdzislawa);
        transferOdGrazynyDoZdzislawa.setDate(LocalDateTime.now().plusDays(1));
        transferOdGrazynyDoZdzislawa.setMoney(200);


        /**
         * Definiujemy transfery sródków z konta Zdzislawa na konto Janusza,
         * który został zlecony wczoraj
         */
        BankAccountOperation transferOdZdzislawaDoJanusza = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdZdzislawaDoJanusza.setSourceBankAccount(kontoZdzislawa);
        transferOdZdzislawaDoJanusza.setTargetBankAccount(kontoJanusza);
        transferOdZdzislawaDoJanusza.setDate(LocalDateTime.now().minusDays(1));
        transferOdZdzislawaDoJanusza.setMoney(100);

        /**
         * rejestrujemy wszystkie transfery w obiekcie zarządzającym kontami bankowymi
         */
        bankAccountManager.registerOperation(transferOdJanuszadoGrazyny);
        bankAccountManager.registerOperation(transferOdGrazynyDoZdzislawa);
        bankAccountManager.registerOperation(transferOdZdzislawaDoJanusza);

        /**
         * wykonujemy transfery, które zostały zlecone na datę i czas
         * wczesniejszy niż teraz.
         * Transfery zlecone na jutro NIE mają się wykonać
         */
        bankAccountManager.performTransfers();


        System.out.println("======== transfery ========");
        System.out.println("Stan konta  Janusza: " +  kontoJanusza.getMoney());
        System.out.println("Stan konta  Grazyny: " +  kontoGrazyny.getMoney());
        System.out.println("Stan konta  Zdzislawa: " +  kontoZdzislawa.getMoney());

    }
}
