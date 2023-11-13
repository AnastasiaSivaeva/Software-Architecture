package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scena;

IModelChangeObserver[] arr = new IModelChangeObserver[100];
arr[0] = new IModelChangeObserver();
ModelStore ModStore = new ModelStore(arr);

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> Models;
    public List<Scena> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangeObserver[] changeObservers;

    public ModelStore(IModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.Models = new ArrayList<>();
        this.Models.Add(new Models);

        this.Scenes = new ArrayList<>();
        this.Scenes.Add(new Scenes);

        this.Flashes = new ArrayList<>();
        this.Flashes.Add(new Flashes);

        this.Cameras = new ArrayList<>();
        this.Cameras.Add(new Cameras);


    }

    public Scena GetScena(int id){
        return Scenes.get(id);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
       
    }
    
}
