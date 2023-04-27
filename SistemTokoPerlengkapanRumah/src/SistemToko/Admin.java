
// package
package SistemToko;

// author
/**
 *
 * @author hp
 */

 // publicclass Final implements
 public final class Admin implements Accounts {
  private String username, password;
  
  // void Akun
  public void Akun() {
      username = "TokoPerlengkapanRumah";
      password = "29April2023";
  }

  // override Username
  @Override
  public String getUsername() {
    return username;
  }
 
  // override Password
  @Override
  public String getPassword() {
    return password;
  }
}