package dguitar.codecs.tablature;

import java.io.BufferedReader;
import java.io.IOException;
import dguitar.codecs.Codec;
import dguitar.codecs.CodecFormatException;
import dguitar.codecs.CodecInputStream;
import dguitar.codecs.guitarPro.GPSong;

public class TablatureParser 
implements Codec,CodecInputStream
{
    TablatureText TT ;
    
    /**
     * The InputStream from which the data is read.
     */
    private BufferedReader _in;
    
    //TablatureTracks 

    public boolean supportedExtension(String extension) {
        boolean supported ;
        
        supported = extension.equalsIgnoreCase("txt") ;
        
        supported = supported || extension.equalsIgnoreCase("") ;
        
        return supported;
    }

    public Object readObject() throws IOException, CodecFormatException {
        GPSong song ;
        String lineRead ;
        String lineToProcess ;
        int  countLinesProccessed ;
        song = null ;
        
        
        
        countLinesProccessed = 0 ;
        
        //read a line
        lineRead = _in.readLine() ;

        while(lineRead != null) {
            lineToProcess = lineRead.trim() ;
            
            if(lineToProcess.length() > 0) {
                countLinesProccessed++ ;
                
                //if is the first usable line 
                if(countLinesProccessed == 0) {
                    
                    
                }
            }
            //if lines contains to many LETTERS...is posible a comment/lyrics
            //inside the tab
            
            //if not...then is posibly a usable information
            
            //keep reading until EOF is read
            
        } 
        
        return song;
    }
    /*sample of input*/
  /*-********************************-*  
    COMFORTABLY NUMB

    "The Wall"

    TAB



    Bm                               A
            Hello, Is there any body in there?
                        G       D/F#  Em        Bm
    Just nod if you can hear me,      is there anyone at home?
    A
    Come on, now, I hear your feeling  down,
          G            D/F#   Em            Bm
    well, I can ease  your  pain,   get you on your feet again.
                            A                   G          D/F#   Em
    relax, I need some information, first,  just the basic facts,
             Bm
    Can you show me where it hurts

    D                           A
    There is no pain you are receding,
    D                                A        G/B
    A distant ships smoke, on the horizon,
    C                               G
    You are only coming through in waves,
    C                                               G
    Your lips move, but I can't hear what your saying,
         D                       A
    When I was a child, I had a fever,
      D                             A       G/B
    my hands felt just like, two ballons,
    C                                   G
    Now I've got that feeling once again,
    G                                 C
    I can't explain, you would not understand,
                            G
    This is not how I am,
    A               G/B  C             G                D
    I______________________  have become, comfortably numb


    SOLO 1:
    e-|---14vvvvvv-----12-14>15>14------------------------------------------------|
    B-|------------------------------15>17vvvvvvvvvv>15--15-14--------------------|
    G-|---------------------------------------------------------14----------------|
    D-|-------------------------------------------------------------14\12vvvvvv---|
    A-|---------------------------------------------------------------------------|
    E-|---------------------------------------------------------------------------|

    e-|--14>12--14>(15)>14--------------------------------------------------------|
    B-|-----------------------15>17---------15--14--------------------------------|
    G-|---------------------------------------------14------------------/12vvvvvv-|
    D-|-------------------------------------------------14\12--11--9--7-----------|
    A-|---------------------------------------------------------------------------|
    E-|---------------------------------------------------------------------------|

    e-|---------------------------------------------------------------|
    B-|---------------------------------------------------------------|
    G-|---11--------------11\9---9\7vvvvv----9>7------7---9---11>12---|
    D-|----------14--12----------------------------9------------------|
    A-|---------------------------------------------------------------|
    E-|---------------------------------------------------------------|

    e-|---15-14-12---------------------------------------------------|
    B-|------------15-12---------------------------------------------|
    G-|------------------12------------------------------------------|
    D-|---------------------12vvvvvvvv--10\9vvvvvvv---10\9\7vvvvv----|
    A-|--------------------------------------------------------------|
    E-|--------------------------------------------------------------|

                                   v-- strike note
    e-|-----------------------------------------------------------|
    B-|-----------------------------------------------------------|
    G-|-11>(12)vvvvvvvv--9>(11)===(11)==>9>7----------------------|
    D-|---------------------------------------7/9\7vvvvvvvvvvv\---|
    A-|-----------------------------------------------------------|
    E-|-----------------------------------------------------------|


    Bm                      A                         G   D/F#  Em
    O.K., just a little pin prick, there'll be no more (scream),
               Bm
    But you may feel a little sick.  Can you stand up?
                       A                              G             D/F#  Em
    I do believe it's working, good  That'll keep you going through the show,
    Bm
    C'mon it's time to go

    D                            A
    There is no pain you are receding,
    D                               A       G/B
    A distant ships smoke on the horizon,
    C                                G
    You are only coming through in waves,
        C                                         G
    Your lips move, but I can't hear what your saying,
        D                              A
    When I was a child, I caught a fleeting glimpse,
    D                        A     G/B
    Out of the corner of my eye,
    C                              G
    I turned to look, but it was gone,
                               C
    I can not put my finger on it now,
                                G
    The child is grown, the dream is gone,
    A               G/B  C          G                 D
    and I___________________, have become comfortably numb


    OUTRO SOLO:
    |---------------------------------------------------------------|
    |---------------------------------------------------------------|
    |--7--9--9>(11)vvvvvv--9>(11)>9>7---7--9--9--7-------7vvvvvvv---|
    |---------------------------------9-------------9--9------------|
    |---------------------------------------------------------------|
    |---------------------------------------------------------------|

    |-------------------------------------------10------------------------------|
    |--------10------10--12--12>(15)>12>10--12----------------------------------|
    |---/11------11---------------------------------------7--9--9>(10)>9>7------|
    |----------------------------------------------------------------------9vvvv|
    |---------------------------------------------------------------------------|
    |---------------------------------------------------------------------------|

    |--------------------------------------------------------------------------|
    |----10>7-------7----------------------------------------------------------|
    |-----------9-------9---7-------------------------------7------------------|
    |--------------------------9vvvvvvvvvv--------7---7--9-----9>7---9vvvvvv---|
    |-----------------------------------------/9-------------------------------|
    |--------------------------------------------------------------------------|

    |--9--9>(10)----7-------7---------------------------|
    |-------------------10-----10>(12)vvv----10>7-------|
    |-----------------------------------------------9---|
    |---------------------------------------------------|
    |---------------------------------------------------|
    |---------------------------------------------------|

    |-------7--------------------------------------------------------|
    |--7--7---10>7---------------------------------------------------|
    |--------------9>(11)>9>7---9-7----------------------------------|
    |-------------------------9-----9-7------------------------------|
    |-----------------------------------9-8-7-5---5vvvvvvvvvvvvvv----|
    |-------------------------------------------7--------------------|

    |--------------------------7-------------------------------------------------|
    |------------------------7---10>7--------------------------------------------|
    |--7-7-7vvvvvvv---9>(11)----------9>(11)>9>7---9-7---------------------------|
    |--------------------------------------------9-----9>7-----------------------|
    |------------------------------------------------------9\7-5-7>5---5--7-7/9--|
    |----------------------------------------------------------------7-----------|

    |----------------------------7----------------------------7-----------------|
    |--------------------------7---10--------7--------------7---10>7------------|
    |-------------7---7-9>(11)--------9>(11)---7--9--9>(11)----------9>(11)>9>7-|
    |--7-7-7--9>7---9-----------------------------------------------------------|
    |---------------------------------------------------------------------------|
    |---------------------------------------------------------------------------|

    |----------------------------------------------------------------------------|
    |---------------------------7--------------7-7-7------------------7-7-7------|
    |----9-7--------------------7--------------7-7-7------------------7-7-7------|
    |--9-----9-7----------------7--9vvvvvvv----7-7-7--"9"vvvvvvvvvv---7-7-7--9vvv|
    |------------9-8-7-5---5>0---------------------------------------------------|
    |--------------------7-------------------------------------------------------|

    |---------------------------------------------7------------------------|
    |--7---------------------------------------------10>7--10>(12)====>10--|
    |--7----9>(11)>9>7-----7--9--9>(11)vvvvvvvv----------------------------|
    |-----7-------------9--------------------------------------------------|
    |----------------------------------------------------------------------|
    |----------------------------------------------------------------------|

    |----------7-------------------------------------------------------|
    |--------7---10>7--------------------------------------------------|
    |-9>(11)----------9>(11)>9>7-9>7---7---------------------------7---|
    |--------------------------------9---9>7-9>7---7------------9--7---|
    |--------------------------------------------9---9-8-7-------------|
    |------------------------------------------------------10-7--------|

    |-----------------------------------------------------------------------|
    |----------7-----7>(8)>7--------------------------7-----------------7---|
    |--------7-7-----7>(8)>7-----------------7>9>7----7-----------------7---|
    |--9-7-9---7-----7>(8)>7-7vvvvvv-7>9------------9---9>7-----7-9>7>9-----|
    |--------------------------------------------------------9--------------|
    |-----------------------------------------------------------------------|

    |-----------------------------------7-----17-17-17>(19)vvv--17-19-21-21>(22)vv|
    |-------7---7---7--7------7---7--7--7-----------------------------------------|
    |-9>7---7---7---7--7----7-7---7--7--7-----------------------------------------|
    |-----9-----7-----------------------7-----------------------------------------|
    |-----------------------------------------------------------------------------|
    |-----------------------------------------------------------------------------|

    |--21>(22)vvv-21-21>(22)>21--21>(22)-21>(22)-21>(22)>21--19>21>19-19-19\---|
    |--------------------------------------------------------------------------|
    |--------------------------------------------------------------------------|
    |--------------------------------------------------------------------------|
    |--------------------------------------------------------------------------|
    |--------------------------------------------------------------------------|

    |-----------------------------------------------------------------------------|
    |-17-17-17--17>(19)>17>15----17-17-17vvvvvv---15--17-17>(18)>17>15vvv---------|
    |-------------------------16-----------------------------------------16-16-16-|
    |-----------------------------------------------------------------------------|
    |-----------------------------------------------------------------------------|
    |-----------------------------------------------------------------------------|

    |----------------------------10---------10----12-12>(13)-10-12-------12--|
    |--------------------10>(12)----10>(12)----10------------------12-12-----|
    |--14-16vvv--------------------------------------------------------------|
    |-----------14-12--------------------------------------------------------|
    |-----------------14-----------------------------------------------------|
    |------------------------------------------------------------------------|

    |-------------------------------------------------------------|
    |-12>(15)>12--12-10---------------------------------------7---|
    |-------------------9>(11)>9>0--9>7---7-9>7---------------7---|
    |-----------------------------------9-------9-7---------------|
    |-----------------------------------------------9-8-7-5-------|
    |-------------------------------------------------------------|

    |-----------------------------------7--7--7--7---7---7---7--7-7--7---7--7--|
    |---7--7--7--7--7-----7---7---7--7--7--7--7--7---7---7---7--7-7--7---7--7--|
    |---7--7--7--7--7-----7---7---7--7-----------------------------------------|
    |-------------------9---9---9----------------------------------------------|
    |--------------------------------------------------------------------------|
    |--------------------------------------------------------------------------|

    |---7-----------------------------------------------||
    |------10-------------------------------------------||
    |----------9>(11)-9--7------------------------------||
    |----------------------9-9-9-7----7-7>9-9>7-9vvvvv--||
    |---------------------------------------------------||
    |---------------------------------------------------||


*/

}
