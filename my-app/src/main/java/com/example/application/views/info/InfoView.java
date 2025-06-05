package com.example.application.views.info;
import com.vaadin.flow.router.PageTitle;

import org.vaadin.lineawesome.LineAwesomeIconUrl;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("System Info")
@Route("info")
@Menu(order = 1, icon = LineAwesomeIconUrl.ANDROID)
public class InfoView extends VerticalLayout{
    
    public InfoView(){
        Span sp = new Span("Informacion de sistema");
        H1 h1 = new H1(sp);

        add(h1);
    }
}
