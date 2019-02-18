package com.example.diaaebakri.hochschuleulm;

import java.util.ArrayList;
import java.util.List;

public class NewsContent {

    int id;
    int image;
    String title;
    String body;


    public NewsContent(String title, String body, int id, int picture){
        this.id = id;
        this.image = picture;
        this.title = title;
        this.body = body;
    }

    public NewsContent(){};

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public static NewsContent getContentById(int contentId){
        for(NewsContent content : nc){
            if(content.getId() == contentId) return content;
        }

        return null;
    }

    static NewsContent[] nc = {

            new NewsContent("Studiern nach modernsten Standards an der Hochschule",
                    "An der Hochschule Ulm wurden diesen Herbst 17 Studiengänge durch die Akkreditierungsagenturen ASIIN und ACQUIN ohne Auflagen erfolgreich reakkreditiert. Mit insgesamt 16 Bachelorstudiengängen und einem Masterstudiengang war in diesem Herbst eine besonders große Anzahl von Studiengängen Gegenstand der regelmäßigen Akkreditierung. Expertengruppen aus externen ProfessorInnen, VertreterInnen aus der Praxis sowie Studierende anderer Hochschulen haben die Qualität der Studiengänge eingehend analysiert.\n" +
                            "\n" +
                            "\u200BIn den abschließenden Gutachten der Experten wurden vor allem der hohe Praxisbezug und die direkte Einbindung aktueller Forschungsergebnisse in die Lehre positiv hervorgehoben. Auch die intensive Betreuung der Studierenden und die kooperative Atmosphäre im Studium wurden von den Gutachtern besonders gewürdigt. „Wir freuen uns über dieses positive Votum zu unseren Studienangeboten. Dadurch sehen wir die Studienkonzepte bestätigt und können die Studiengänge zugleich gezielt weiterentwickeln“, so Prorektor Professor Dr. Sven Völker.",
                    1, R.drawable.article_1),

            new NewsContent("Campus live erleben: Hochschule feiert Eröffnung der Linie 2",
                    "Die neue Linie 2 der Stadt Ulm ist eingeweiht. Zur feierlichen Eröffnung des zentralen Ulmer Nahverkehrsprojekts öffnete die Hochschule am Standort Albert-Einstein-Allee ihre Türen für Besucher, die an diesem Tag kostenlos auf der neuen Straßenbahn unterwegs waren.\n" +
                            "\n" +
                            "Begrüßt vom großen Banner an der Außenfassade, das auf die anstehende Umbenennung der Hochschule in „Technische Hochschule Ulm“ (zum 1.3.2019) ankündigte, konnten die rund 300 Besucher das Hochschulmotto „Studier, was dich bewegt“ selbst erleben. Auf großes Interesse stieß dabei der virtuelle Rundgang durch den Campus per VR-Brille, den die Fakultät Informatik im Untergeschoss anbot. Beliebtestes Exponat im Erdgeschoss war der ferngesteuerte Bewegungsroboter HS-8, den Studierende der Medizintechnik gebaut hatten. Ganz wie sein Vorbild, der kleine Roboter BB8 aus den aktuellen Star Wars Filmen, rollte der Roboter in Ballform quitschfiedel durch die Gänge des Campus Albert-Einstein-Allee.",
                    2, R.drawable.article_2),

            new NewsContent("Hochschule Ulm wird umbenannt",
                    "In einem intensiv geführten, unter Einbeziehung aller Anspruchsgruppen angelegten Strategieprozess haben wir für das Selbstverständnis der Hochschule Ulm bzw. als ihren Markenkern den Begriff „Technische Hochschule Ulm\" herausgearbeitet; abschließend haben alle relevanten Hochschulgremien dieses Ergebnis einstimmig bestätigt. Als Konsequenz haben wir daher einen Antrag auf Umbenennung unserer Hochschule gestellt und das Wissenschaftsministerium hat diesem Antrag mit Wirkung zum 01.03.2019 zugestimmt. Wir werden damit die erste Hochschule für Angewandte Wissenschaften (HAW) in Baden-Württemberg sein, die diesen Schritt geht. Dies erfüllt uns mit großer Freude, stellt aber auch eine inhaltliche Herausforderung dar.\n" +
                            "\n" +
                            "Wir versprechen uns vom neuen Namen ein weithin strahlendes, kraftvolles und profilschärfendes Signal in unsere Region. Der neue Name schreibt die Tradition unserer Hochschule seit der Gründung als staatliche Ingenieurschule vor 58 Jahren fort, deren fachliche Ausrichtung die heutige Hochschule stetig weiterentwickelt, im Kern aber nie verlassen hat. So war und ist das Portfolio aller unserer Studienangebote stets technisch orientiert, gleichzeitig bleiben wir vom Typ her eine Hochschule für Angewandte Wissenschaften – mit dem ausdrücklichen Fokus auf der Kernkompetenz Technik.",
                    3, R.drawable.article_3),

            new NewsContent("Kontakte knüpfen und durchstarten", "\u200BDie Hochschule Ulm veranstaltete auf dem Campus in der Prittwitzstrasse die Karrierebörse für Studierende und angehende Absolventinnen und Absolventen. Hier trafen Jungakademiker aller technischen Fachrichtungen auf Top-Unternehmen der Region. Die Wahl des passenden Arbeitgebers dem Zufall zu überlassen, können und möchten sich Studierende heute nicht mehr leisten. Daher war die Karrierebörse der Hochschule Ulm mit 62 Ausstellern einmal mehr eine gute Anlaufstelle für Studierende, Absolventinnen und Absolventen, um sich über potentiellen Arbeitgeber zu informieren und direkt mit ihnen ins Gespräch zu kommen."
                    , 4, R.drawable.article_4)


    };

    public static List ncList = new ArrayList();

    static {
        for(NewsContent x : nc){
            ncList.add(x);
        }
    }
}
