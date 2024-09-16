import java.util.Scanner;
public class Bai2 {
    boolean kiemtranguyento(int n){
        for(int i =2; i<=Math.sqrt(n);i++){
         if(n%i == 0){
          return false;
         }
        }
        return true;
       }
       public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.printf("Kiem tra so nguyen to \n");
        System.out.printf("Nhap vao so nguyen duong \n");
        int n = s.nextInt();
        kiemtranguyento snt = new kiemtranguyento();
        if(snt.kiemtranguyento(n)){
         System.out.printf("So : " +n +" la so nguyen to");
        }else{
         System.out.printf("So : " +n +" khong phai la so nguyen to");
        }
       }
}
