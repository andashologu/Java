public class DataTypes {

    public static void main(String[] args) {
        
        /*
            Primitive Data Types
            byte:    8 bits;  1 byte; min: -127 max: 127
            short:   16 bits; 2 bytes; min: -32 76 8  max: 32 767
            int:     32 bits; 4 bytes; min : -2^31 (or -2 147 483 648) max: 2^31-1 (or 2 147 483 647)
            long:    64 bits; 8 bytes; min: -2^63 (9 223 372 036 854 775 808) max: 2^63-1 (9 223 372 036 854 775 807)
            float:   32 bits; 4 bytes; 6 to 7 decimal digits
            double:  64 bits; 8 bytes; 15 decimal digits
            boolean: 1 bit; true or false
            char: ;  2 bytes; single character/letter or ASCII values
        */
        
        //Declaration and Initialization................
        /*
            Creating viariables is called declaration => DATATYPE & VARIABLE NAME
            Giving an initial value to a variable is called Initialization
        */
        
        String firstname = "Anda"; //String
        String lastname = "Shologu"; //String
        int age = 15; //Integer
        String text = "Hello World";
        //Long id = 12318722986L;
        Float score = 3.9f;
        
        System.out.println(text+". I am "+firstname+" "+lastname+" and am "+age+" years old. My api score is "+score);

    }  
}