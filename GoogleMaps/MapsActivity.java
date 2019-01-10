package com.facebook.www.SQL;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.facebook.www.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
         mMap.animateCamera( CameraUpdateFactory.zoomTo( 17.0f ) );
        SetMarker(new LatLng(13.0587,80.2757),R.drawable.gym);
    }

    void SetMarker(LatLng position, int mapIcon) {
        MarkerOptions options = new MarkerOptions();
        options.position(position);
        options.icon(BitmapDescriptorFactory.fromResource(mapIcon));
        mMap.addMarker(options);
    }

}
