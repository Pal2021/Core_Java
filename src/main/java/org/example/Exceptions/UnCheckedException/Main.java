package org.example.Exceptions.UnCheckedException;

public class Main {
    public static void main(String[] args) {
      try {
          solve();
      }catch (ClassNotFoundException classNotFoundException){

      }
    }

    private static void solve() throws ClassNotFoundException{
        throw new ClassNotFoundException();
    }
}
