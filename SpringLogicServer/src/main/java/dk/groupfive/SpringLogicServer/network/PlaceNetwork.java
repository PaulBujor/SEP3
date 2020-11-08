package dk.groupfive.SpringLogicServer.network;

import dk.groupfive.SpringLogicServer.model.objects.Place;

import java.util.List;

public interface PlaceNetwork {
    List<Place> getAllPlaces();

    Place getPlaceByID(long id);

    void addPlace(Place place);

    void updatePlace(Place place);

    void deletePlace(long id);
}
