package place;

import java.io.IOException;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;

import Main.GamePanel;

public class PlayerInfo extends Place{

    GamePanel gp;
    Place[] playerInfo;

    public PlayerInfo (GamePanel gp) {
        
        this.gp = gp;

        playerInfo = new Place[10];

        getBackGroundImage();
    }

    public void getBackGroundImage() {
        try {
            playerInfo[0] = new Place();
            playerInfo[0].image = ImageIO.read(getClass().getResourceAsStream("/res/BackGround/background1.jpg"));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {

           g2.drawImage(playerInfo[0].image, gp.boardsize, 0, gp.boardsize, gp.boardsize, null);
        
    }
}

