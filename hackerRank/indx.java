 Scanner inputUser = new Scanner(System.in);
        String smallest = "";
        String largest = "";

        String s = inputUser.nextLine();
        int k = inputUser.nextInt();

        int indexLargest = s.length();
        int sumL = indexLargest - k;

        int indexSmallest = s.length() - k;
        int indexHighest = k;

        // smallest
        System.out.println(s.substring(sumL));

        // highest
        System.out.println(s.substring(0, k));
        
