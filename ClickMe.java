class ClickMe {
  public static void main(String[] args) {
    System.out.println("Pull");
    System.out.println("");
    String name = "MY NAME IS BRIAN";

    for(int i = 0;i < name.length();i++){
      System.out.println(name.charAt(i) + "");
      try {
        Thread.sleep(100);
      }catch (Exception e) {
        e.printStackTrace();
      }

    }

  }
}
