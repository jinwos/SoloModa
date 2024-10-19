package com.example.solomoda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle; // Importa la clase Bundle para guardar el estado de la actividad.
import android.preference.PreferenceManager; // Importa PreferenceManager para gestionar las preferencias de la aplicación.
import android.view.View; // Importa la clase View para manejar vistas en la interfaz.
import android.widget.AdapterView; // Importa AdapterView para manejar eventos en vistas adaptables.
import android.widget.ArrayAdapter; // Importa ArrayAdapter para adaptar arrays a vistas como Spinners.
import android.widget.Spinner; // Importa Spinner, que es una lista desplegable en Android.
import org.osmdroid.config.Configuration; // Importa la clase Configuration para configurar el mapa.
import org.osmdroid.tileprovider.tilesource.TileSourceFactory; // Importa TileSourceFactory para definir los tipos de mapas disponibles.
import org.osmdroid.tileprovider.tilesource.XYTileSource; // Importa XYTileSource para crear un proveedor de azulejos específico para mapas personalizados.
import org.osmdroid.util.GeoPoint; // Importa GeoPoint, que representa coordenadas geográficas (latitud y longitud).
import org.osmdroid.views.MapView; // Importa MapView, que es el componente visual del mapa.
import org.osmdroid.views.overlay.Marker; // Importa Marker para agregar marcadores en el mapa.
import org.osmdroid.views.overlay.Polyline; // Importa Polyline para dibujar líneas en el mapa.




import androidx.appcompat.app.AppCompatActivity;

public class VentanaTiendas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiendas);
        //carga la configuracion del mapa usando las preferencias predeterminadas
        Configuration.getInstance().load(getApplicationContext(), PreferenceManager.getDefaultSharedPreferences(getApplicationContext()));
        //
        MapView mapView = findViewById(R.id.mapView);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);
        double falabellaLatitud = -33.4181939;
        double falabellaLongitud = -70.6068748;

        GeoPoint FalabellaPunto = new GeoPoint(falabellaLatitud, falabellaLongitud);
        mapView.getController().setZoom(15.0);
        mapView.getController().setCenter(FalabellaPunto);
        //crear marcadores.
        Marker marcadorFalabella = new Marker(mapView);
        marcadorFalabella.setPosition(FalabellaPunto);
        marcadorFalabella.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        marcadorFalabella.setTitle("Falabella, Costanera Center");
        marcadorFalabella.setSnippet("Multitienda centrada en variedad de productos, tanto para hogar como personal como electronica.");
        mapView.getOverlays().add(marcadorFalabella);

        //marcador 2 Ripley

        double RipleyLatitud = -33.4173837;
        double RipleyLongitud = -70.6072577;

        GeoPoint RipleyPunto = new GeoPoint(falabellaLatitud, falabellaLongitud);
        mapView.getController().setZoom(15.0);
        mapView.getController().setCenter(RipleyPunto);
        //crear marcadores.
        Marker MarcadorRipley = new Marker(mapView);
        MarcadorRipley.setPosition(RipleyPunto);
        MarcadorRipley.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        MarcadorRipley.setTitle("Ripley Costanera Center");
        MarcadorRipley.setSnippet("Multitienda centrada en variedad de productos, tanto para hogar como personal como electronica.");

        mapView.getOverlays().add(MarcadorRipley);

        //marcador 3 HYM
        double HYMLatitud = -33.4179935;
        double HYMLongitud = -70.6063901;

        GeoPoint HYMPunto = new GeoPoint(HYMLatitud, HYMLongitud);
        mapView.getController().setZoom(15.0);
        mapView.getController().setCenter(HYMPunto);
        //crear marcadores.
        Marker MarcadorHYM = new Marker(mapView);
        MarcadorHYM.setPosition(HYMPunto);
        MarcadorHYM.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        MarcadorHYM.setTitle("HYM, Costanera Center");
        MarcadorHYM.setSnippet("Multitienda centrada en variedad de productos, tanto para hogar como personal como electronica.");

        mapView.getOverlays().add(MarcadorHYM);


        //marcador 4 RYR
        double RYRLatitud = -33.4194608;
        double RYRLongitud = -70.6066222;

        GeoPoint RYRPunto = new GeoPoint(RYRLatitud, RYRLongitud);
        mapView.getController().setZoom(15.0);
        mapView.getController().setCenter(HYMPunto);
        //crear marcadores.
        Marker MarcadorRYR = new Marker(mapView);
        MarcadorRYR.setPosition(RYRPunto);
        MarcadorRYR.setAnchor(Marker.ANCHOR_CENTER,Marker.ANCHOR_BOTTOM);
        MarcadorRYR.setTitle("RYR Moda");
        MarcadorRYR.setSnippet("Multienda centrada venta de ropa.");
        mapView.getOverlays().add(MarcadorRYR);
    }
    public void onClickInicio(View view){
        Intent intent = new Intent(this, AccesoActivity.class);
        startActivity(intent);
    }
}
