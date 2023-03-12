abstract class Compartment
{
   public abstract String notice();
}
class FirstClass extends Compartment
{
   public String notice()
   {
      return "First class compartment";
   }
}
class Ladies extends Compartment
{
   public String notice()
   {
      return "Ladies compartment";
   }
}
class General extends Compartment
{
   public String notice()
   {
      return "General compartment";
   }
}
class Luggage extends Compartment
{
   public String notice()
   {
      return "Luggage compartment";
   }
}
class TestCompartment
{
   public static vid main(String[] args)
   {
       
   }
}