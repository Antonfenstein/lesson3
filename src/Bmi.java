public class Bmi
{
    public static void main(String[] args)
    {
      double  weight ;
      double  height ;
      double bmi ;

      weight = 90.0 ;
      height = 1.8 ;

      bmi = weight / (height*height) ;

        System.out.println("BMI index (kg/m2) = " + bmi );
}
}