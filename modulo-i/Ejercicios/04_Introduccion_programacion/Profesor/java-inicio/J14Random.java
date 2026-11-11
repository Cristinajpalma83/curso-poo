
public class J14Random {
    public void main() {
        int num;
        int c1, c2, c3, c4, c5, c6;
        c1 = c2 = c3 = c4 = c5 = c6 = 0;
        int cant = 10000000;
        for (int i = 1; i <= cant; i++) {
            num = (int) Math.ceil(Math.random() * 6);
            switch(num) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
            }
        }
        System.out.println(1. * c1 / cant);
        System.out.println(1. * c2 / cant);
        System.out.println(1. * c3 / cant);
        System.out.println(1. * c4 / cant);
        System.out.println(1. * c5 / cant);
        System.out.println(1. * c6 / cant);
    }
}