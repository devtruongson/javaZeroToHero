public class Four implements Second, Three {
    @Override
    public void secondSpeak() {
        System.out.println("SecondSpeak");
    }

    @Override
    public void threeSpeak() {
        System.out.println("Three speak");
    }
}
