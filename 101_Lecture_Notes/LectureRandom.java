/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        // Your Code Goes here!
       
        System.out.println(Math.random()*5); //0-5x
        System.out.println(Math.random()*20+15); //15-35x
        System.out.println(Math.random()*10001+5234); //5234 - 15235x (1)
        System.out.println(Math.random()*(15235-5234)+5234); //5234 - 15235x (2)
    
        int A = (int)(Math.random()*50+30);
        int B = (int)(Math.random()*50+90);
        
        System.out.println((int)Math.random()*(B-A)+A); //int((30-80) & (90-140))
	}
}
