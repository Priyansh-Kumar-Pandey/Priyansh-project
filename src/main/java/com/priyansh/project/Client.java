package com.priyansh.project;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Client {
    public static void main(String[] args) {
        HTMLDocument document = HTMLDocument.current();
        HTMLElement div = document.createElement("div");
        div.appendChild(document.createTextNode("my webhook is working perfectly"));
        document.getBody().appendChild(div);
    }
}
