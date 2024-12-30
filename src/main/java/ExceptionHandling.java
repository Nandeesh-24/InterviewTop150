public class ExceptionHandling {


    public static void main(String[] args) {
        exceptionHandling();
    }

    public static void exceptionHandling(){
        try{
            System.out.println(Integer.parseInt("sdkjcvb"));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Executed");
        }
    }

}
