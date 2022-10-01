public class new {
    
}
interface camera{
    void record();
    void capture();

}
interface music_player{
    void play();

    default void skip(){
        System.out.println("Song is skipped");
    }
}

class cellphone{
    public void pick_call(){
        System.out.println("call has been picked");

    }
    public void decline_call(){
        System.out.println("Call declined");

    }
}

class Smart_phone extends cellphone implements camera,music_player{
    public void record(){
        System.out.println("recording");

    }
    public void capture(){
        System.out.println("video");

    }
    public void play(){
        System.out.println("Playing your favourite song");
    }
}


public class phone {
    Smart_phone phn=new Smart_phone();
   phn.record();




}
