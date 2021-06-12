class PrePostIncrementDecrementPractice {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6" b/c incremented b4 stmt is executed
        System.out.println(i++);  // "6" b/c increments after stmt is executed
        System.out.println(i);    // "7"
    }
}