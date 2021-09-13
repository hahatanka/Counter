public class Counter {
    //Recursion: the process of a function/ method calling itself

    //Create a method that counts from a start number to finish number
    void countTo(int start, int stop) {
        //check if start value is greater than final value. Then return an error if so
        if (start > stop) {
            System.out.println("Start value must be less than final value. Please try again!");
            return;
        }
        //Print the value of start to console
        System.out.println(start);

        //then add 1 to the value of start
        start++;

        if (start <= stop) { //checks if the stop number is still bigger than the startnum
            countTo(start, stop);// we call the function "countTo" inside the same function
        }
        return;
    }

    void countBack(int start, int stop) {if (start < stop) {
        System.out.println("Start value must be more than final value. Please try again!");
        return;
    }
        //Print the value of start to console
        System.out.println(start);

        //then deduct 1 to the value of start
        start--;

        if (start >= stop) { //checks if the stop number is still smaller than the startnum
            countBack(start, stop);// we call the function "countBack" inside the same function
        }
        return;
    }
}
