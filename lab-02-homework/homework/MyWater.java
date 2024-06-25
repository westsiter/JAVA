public class MyWater {
    private int L = 0;
    private int M = 0;
    private int S = 0;

    int getL(){
        return L;
    }
    int getM(){
        return M;
    }
    int getS(){
        return S;
    }
    void addLarge(int l) {
        L+=l;
    }
    void addMedium(int m){
        M+=m;
    }
    void addSmall(int s){
        S+=s;
    }
    double water(){
        return L*2+M+S*0.5;
    }
}
