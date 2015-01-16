package persistence;

import model.Image;
import java.util.List;

public abstract class ImageListLoader {
    
    public abstract List<Image> load();
}