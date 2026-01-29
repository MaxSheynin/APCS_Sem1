/* 
    Lecture note example - Methods
*/
    import java.util.Scanner;
class LectureMethod{
    public static void main(String args[]) {
        //Your code starts here!
        Scanner sc = new Scanner(System.in);
        System.out.println("First number:");
        int num1 = sc.nextInt();
        System.out.println("Second number:");
        int num2 = sc.nextInt();
        
        System.out.println(squared(num1));
        int num1Squared = squared(num1);
        
        System.out.println(absolute(num1));
        int num2Absolute = absolute(num2);
        System.out.println(num2Absolute);
        //can either print num1 squared or store it 
    }
        public static int squared(int a){
            int answer = a*a;
            return answer;
        }
        public static int absolute(int a){
            if(a<0){
                return a*(-1);
            }
            else{
                return a;
            }
        }
        }

