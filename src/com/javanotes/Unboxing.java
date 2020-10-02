int firstint = objectInt.intValue();
        String firstString = secondObjectInt.toString();
        String secondString = thirdObjectInt.toString();

        try{
             int firstStringInt = Integer.parseInt(firstString);
        }catch(NumberFormatException excep){

        	throw new NotEvenANumber();
        }

        try{
        	int secondStringInt = Integer.parseInt(secondString);
        }   catch(NumberFormatException secondExcep){

        	throw new NotEvenANumber();
        }
