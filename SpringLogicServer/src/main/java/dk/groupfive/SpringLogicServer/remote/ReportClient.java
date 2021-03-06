package dk.groupfive.SpringLogicServer.remote;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import dk.groupfive.SpringLogicServer.model.objects.*;
import dk.groupfive.SpringLogicServer.model.objects.obsolete.ReviewItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ReportClient {
    final String HOST = "localhost";
    final int PORT = 7030;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Gson gson;
    private ObjectMapper objectMapper;

    public ReportClient() throws IOException {
        socket = new Socket(HOST, PORT);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        gson = new Gson();
        objectMapper = new ObjectMapper();
    }


    public synchronized void addReportPlace(Report<Place> report) {

        out.println("reportPlace");
        String send = gson.toJson(report);

        /*try {
            send = objectMapper.writeValueAsString(report);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        System.out.println(send);
        out.println(send);
    }

    public synchronized void addReportUser(Report<UserData> report) {
        out.println("reportUser");
        String send = gson.toJson(report);
        out.println(send);
    }

    public synchronized void addReportReview(Report<Review> report) {
        out.println("reportReview");
        String send = gson.toJson(report);
        out.println(send);
    }
}
