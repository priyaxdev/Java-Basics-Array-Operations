import java.util.Scanner;
class arr{
    Scanner s=new Scanner(System.in);
    int len;
    int[] a;
    int[] ar={1,2,3,4,5,6,2,7,8,9,};
    public void inp(){
        System.out.println("ENTER THE LENGTH OF ARRAY");
        len=s.nextInt();
        a=new int[len];
        for(int i=0;i<len;i++){
            System.out.println("ENTER THE " + (i+1) + " number TO BE ENTER IN ARRAY ");
            int p=s.nextInt();
            a[i]=p;
        }
    }
    public void display(){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void occ(){
        System.out.println("ENTER THE NO FOR WHICH U WANT TO FIND THE OCCURENCE ");
        int n=s.nextInt();
        int count=0;
        for(int i =0;i<ar.length;i++){
            if(ar[i]==n){
                count+=1;
                System.out.println("the number of occurence of the given no "+count);
            }
        }
    }
    public void lastocc(){
        System.out.println("ENTER THE NO. WHOSE LAST OCCURENCE U WANT TO FIND ");
        int n=s.nextInt();
        int count=0;
        for(int i=ar.length-1;i>=0;i--){
            if(ar[i]==n){
                count+=1;
                if(count==1){
                    System.out.println("POSITION IN ARRAY AT"+(i+1));
                }
            }
        }
        //       METHOD 2 OF SAME PROBLEM
        int p=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==n){
                p=i;
            }
        }
        System.out.println("POSITION IN ARRAY AT"+p);
    }
    //  COUNT THE NUMBER OF ELEMENT STRICTLY GREATER THAN GIVEN NO X
    public void gre(){
        System.out.println("ENTER THE NUMBER TO FIND HOW MANY NUMBER ARE GREATER THAN THE GIVEN NO");
        int x=s.nextInt();
        int count=0;
        for(int i=0;i<ar.length;i++) {
            if (ar[i] > x) {
                count += 1;

            }
        }
    }
    public void sor(){
        boolean p=true;
        for(int i=1;i<ar.length;i++){
            if(ar[i]<ar[i-1]){
                p=false;
                break;
            }
        }
        System.out.println(p);;
    }
    // TO FORM AN ARRAY FROM THE GIVEN ARRAY WHICH CONSIST OF TWO NUMBER SMALLEST AND LARGEST OF GIVEN ARRAY
    public void sl(){
        int M=ar[0];
        int m=ar[0];
        int[] b=new int[2];
        for(int i=0;i<ar.length;i++){
            if(M<ar[i]){
                M=ar[i];
            }
            if(m>ar[i]){
                m=ar[i];
            }
        }
        b[0]=m;
        b[1]=M;
        System.out.println("smallest number"+b[0]);
        System.out.println("Largest number"+b[1]);
    }
}
public class array{
    public static void main(String[] args) {
        arr obj1=new arr();
        obj1.inp();
        obj1.display();
        obj1.occ();
        obj1.lastocc();
        obj1.gre();
        obj1.sor();
        obj1.sl();
        lect16 obj2=new lect16();
        obj2.tarsum();
        obj2.tartrip();
        obj2.arrman();
        obj2.secmax();

        int result=obj2.rep();
        System.out.println(result);
        lect17 obj3= new lect17();
        obj3.rev();
        obj3.rev1();
        obj3.rot();



    }
}
class lect16{
    Scanner s=new Scanner(System.in);
    int[] a={9,4,6,3,7,2,5};
    // FIND THE TOTAL NO OF PAIRS IN THE ARRAY WHOSE SUM IS EQUAL TO THE GIVEN VALUE X
    public void tarsum(){
        System.out.println("ENTER THE NUMBER WHOSE SUM U WANT ");
        int x=s.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[i] + a[j]==x){
                    count+=1;

                }

            }
        }
        if(count==0){
            System.out.println("THERE ARE NO PAIR EXIST WHOSE SUM IS GIVEN NUMBER");
        }
        System.out.println("NO OF THE PAIR "+count);
    }
    // FIND THE TOTAL NO OF TRIPLET IN THE ARRAY WHOSE SUM IS EQUAL TO THE GIVEN VALUE X
    public void tartrip(){
        System.out.println("ENTER THE NO WHOSE TRIPLET U WANT ");
        int x=s.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==x){
                        count+=1;
                    }
                }
            }
        }
        if(count==0){
            System.out.println("THERE ARE NO PAIR EXIST WHOSE SUM IS GIVEN NUMBER");
        }
        System.out.println("no of pair"+count);
    }
//    find the unique number in array where all the elements are being repeated twice with one value being unique
//    and all number are positive
    public void arrman(){
        int[] ar={1,2,3,3,2,1,4};
        int l=ar.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(ar[i]==ar[j]){
                    ar[i]=-1;
                    ar[j]=-1;

                }
            }
        }
        int ans=-1;
        for(int i=0;i<l;i++){
            if(ar[i]>0){
                ans=ar[i];
            }
        }
        System.out.println(ans);
    }
//    Second largest value of array
    
    public void secmax(){
        int M=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>M){
                M=a[i];
            }

        }
        for(int j=0;j<a.length;j++){
            if(a[j]==M){
                a[j]=Integer.MIN_VALUE;
            }
        }
        int m=Integer.MIN_VALUE;
        for(int k=0;k<a.length;k++){
            if(a[k]>m){
                m=a[k];
            }
        }
        System.out.println("second largest value of array"+m);

    }
//    program to find the first repeated integer in the given array
    static int rep(){
        int[] ar={1,4,5,3,5,3,3,2};
        int ans=-1;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    return ar[i];


                }
            }
        }
        return -1;
    }


}
//lecture 17 java dsa
class lect17 {
    Scanner s = new Scanner(System.in);
    int[] A={1,2,3,4,5,6,7,8,9};
    int[] ap;

    //     GIVEN THE 2 NUMBER A AND B SWAP THE 2 GIVEN VALUES USING TEMPORARY VARIABLES
    public void swap() {
        System.out.println("ENTER THE FIRST NUMBER A ");
        int a = s.nextInt();

        System.out.println("ENTER THE SECOND NUMBER B ");
        int b = s.nextInt();
        int A = a;
        int B = b;
        a = b;
        b = A;
        System.out.println(a);
        System.out.println(b);

    }
//    Given 2 integers a and b swap the 2 given values using sum and difference method
    public void swap1(){
        int a=3;
        int b=9;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
//       logically looking right but seems to be incorrect
//  REVERSE AN ARRAY CONSIST OF INTEGER VALUE
    public int rev1(){
        int l=A.length;
        for(int i=l-1;i>=0;i--){
//            System.out.print(A[i]);
            ap[l-i-1]=A[i];

        }
        for(int j=0;j<ap.length;j++){
            System.out.println(ap[j]) ;
        }
        return 1;

    }

    //  doubted area doubted
    public void rev(){
        int l=A.length;
        ap=new int[l];
        int j=0;
        for(int i=l-1;i>=0;i--){
            ap[j++]=A[i];

        }
        for(int k=0;k<l;k++){
            System.out.println(ap[k]);
        }
    }
//    rotate an array around a given integer
    public void rot(){
        System.out.println("ENTER THE NUMBER FROM WHERE U WANT TO ROTATE THE ARRAY");
        int p=s.nextInt();
        int l=A.length;
        for(int i=l-p;i<l;i++){
            System.out.print(A[i]);
        }
        for(int j=0;j<l-p;j++){
            System.out.print(A[j]);
        }

    }
    
}