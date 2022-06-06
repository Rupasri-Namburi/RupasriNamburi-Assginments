package ExceptionHandling;

@SuppressWarnings("serial")
class InvalidTransaction extends Exception
{
     String errorMessage;
     public InvalidTransaction(String message)
     {
        errorMessage = message;
     }  
       
      public String getMessage()
      {
          return errorMessage;
      }
}
