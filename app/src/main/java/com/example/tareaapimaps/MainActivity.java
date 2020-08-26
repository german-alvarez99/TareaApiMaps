package com.example.tareaapimaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap Mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        Mapa = googleMap;
    }

    public void cambiarVistaMapa(View view) {
        Mapa.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        Mapa.getUiSettings().setZoomControlsEnabled(true);
    }

    public void moverCamaraMapa(View view) {
        CameraUpdate camUpd1 = CameraUpdateFactory.newLatLngZoom(new LatLng(-1.012706, -79.469527), 17);
        Mapa.moveCamera(camUpd1);

        PolylineOptions lineas = new PolylineOptions()
                .add(new LatLng(-1.012167, -79.467077))
                .add(new LatLng(-1.013466, -79.467153))
                .add(new LatLng(-1.013217, -79.471849))
                .add(new LatLng(-1.011882, -79.471831))
                .add(new LatLng(-1.012167, -79.467077));
        lineas.width(8);
        lineas.color(Color.RED);
        Mapa.addPolyline(lineas);

        LatLng punto = new LatLng(-1.012978, -79.467704);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Auditorio Carlos Coartaza"));

        punto = new LatLng(-1.012426, -79.467631);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Parqueadero estudiantil"));

        punto = new LatLng(-1.012332, -79.468438);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Biblioteca"));

        punto = new LatLng(-1.012887, -79.469391);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Facultad de Ciencias Agrarias"));

        punto = new LatLng(-1.012937, -79.469978);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Bar D' Scarlet"));

        punto = new LatLng(-1.013061, -79.468477);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Rectorado"));

        punto = new LatLng(-1.012554, -79.470599);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Facultad Ciencias de la Ingeniería"));

        punto = new LatLng(-1.012653, -79.471098);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Facultad Ciencias Ambientales"));

        punto = new LatLng(-1.012154, -79.470154);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Facultad Ciencias Empresariales"));

        punto = new LatLng(-1.012202, -79.469679);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Instituto de Informática"));

        punto = new LatLng(-1.012253, -79.468813);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Edificio administrativo"));

        punto = new LatLng(-1.012242, -79.469022);
        Mapa.addMarker(new MarkerOptions().position(punto).title("Centro médico"));
    }

    public void pintarPoligono(View view) {
    }
}