package br.com.ReinforcingJava.Exceptions.runtimetest;

import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {

        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index");
        }catch(IllegalArgumentException e){
            System.out.println("Illegal");
        }catch (RuntimeException e){
            System.out.println("a deu merda");
        }

        try{
            talvezLance();
        } catch (FileAlreadyExistsException | SQLException e) {
            throw new RuntimeException(e);

        }
    }
   private  static void talvezLance() throws SQLException , FileAlreadyExistsException {

   }
}

