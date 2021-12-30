public static void main(String args[]) {
    public String mathFunction(int num1, int num2, int num3) {
        String operation;
        if (num1 + num2 == num3) {
            operation.append("+");
        } else if (num1 - num2 == num3) {
            operation.append("-");
        } else if (num1 * num2 == num3) {
            operation.append("*");
        } else if (num1 / num2 == num3) {
            operation.append("/");
        } else {
            operation.append("none");
        }
    }

    @Test
    public void testMath(){
        assertEquals("+", mathFunction(1,2,3));
        assertEquals("+*", mathFunction(2,2,4));
    }
}


// Thanks again for giving me the chance to interview with you. I'll be honest my experties falls under javascript and react.js and this is my first time writing Java. I'm open to learning java and mastering any skill you will require of me to excel in my job.  I wish you the best and  Happy New Years. 
