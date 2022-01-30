 public static boolean isPrime (int num) {
        boolean check = true;
        int j = 2;
        if (num <= 1) {
            check = false;
        } while(j <= num / 2) {
            if (num % j != 0) {
            } else { check = false;
            }
            j++;
        }
        return check;
    }
