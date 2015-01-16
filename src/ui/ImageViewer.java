package ui;

import model.Image;

public interface ImageViewer {
    
    public Image getImage();
    public void setImage(Image image);
    
    public void showNextImage();
    public void showPrevImage();
}
