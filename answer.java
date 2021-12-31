public class Answer {

    public static void main(String[] args) {

        StringBuffer example1 = mathFunction(2, 2, 4);
        StringBuffer example2 = mathFunction(6, 2, 3);
        System.out.println(example1);
        System.out.println(example2);

    }

    public static StringBuffer mathFunction(int num1, int num2, int num3) {
        StringBuffer x = new StringBuffer(" ");
        if (num1 + num2 == num3 && num1 * num2 == num3) {
            x.append("+*");
        } else if (num1 + num2 == num3) {
            x.append("+");
        } else if (num1 - num2 == num3) {
            x.append("-");
        } else if (num1 * num2 == num3) {
            x.append("*");
        } else if (num1 / num2 == num3) {
            x.append("/");
        } else {
            x.append("none");
        }

        return x;

    }

    //extra credit  

    // @Test
    // public void testMath() {
    //     assertEquals("+", mathFunction(1, 2, 3));
    // }

}



// Tha gain for giving me the chance to interview with you. I'll be honest
// my experties falls under javascript and react.js and this is my first time
// writing Java. I'm open to learning java and mastering any skill you will
// require of me to excel in my job. I wish you the best and Happy New Years.
