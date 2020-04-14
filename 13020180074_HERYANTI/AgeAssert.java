class AgeAssert {

public static void main(String[]
args) {

int age = Integer.parseInt(args[0]);

assert(age>0);

/* jika usia sifatnya valid (contoh, age>0) */

if (age >= 18) {

System.out.println("You're adult");

}

}

}