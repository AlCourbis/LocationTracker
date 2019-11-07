package com.functionality.locationtracker;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ParametersCollection {

    /**Location permission value, used in MainActivity**/
    public static final int REQUEST_LOCATION_PERMISSION = 200;

    /**Tag assimilated to the periodic worker defined in MainActivity**/
    public static final String LOCATION_TRACKER_TAG = "LOCATION UPDATE";

    /**Shared preferences file name**/
    public static final String sharedPrefFile = "LocationTrackerPreferences";

    /**Repeat interval used to set up location worker's period. Used in MainActivity.java. Unit is minutes**/
    public static final int APPLICATION_REPEAT_INTERVAL = 15;

    /**Day time interval when app is allowed to ask for location. Used in DailyLocationTracker.java**/
    public static final String DEFAULT_START_TIME = "06:00";
    public static final String DEFAULT_END_TIME = "24:00";

    /**Simple date formats used in DailyLocationTracker for database update and address fetching**/
    public static final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public static final DateFormat dayTime = new SimpleDateFormat("HH:mm", Locale.getDefault());

    /**Tag assimilated to the application's log in order to check Worker's status**/
    public static final String LOCATION_SERVICE_TAG = "DAILY TRACKER";

    /**Location request parameters, the higher LOCATION_PERIOD is, the more accurate the location will be.
     * FASTEST_INTERVAL defines the maximal delay if there is another app that asks for location.
     * Both are used in DailyLocationTracker.
     */
    public static final int LOCATION_PERIOD = 10000;
    public static final int FASTEST_INTERVAL = LOCATION_PERIOD/2;

    /**Broadcast tag name used to define a broadcast in DailyLocationTracker and a listener in MainActivity**/
    public static final String BROADCAST_TAG = BuildConfig.APPLICATION_ID + ".ACTION_BROADCAST_ADDRESS";

    /**Titles and Messages displayed in MainActivity's dialog**/
    public static final String TOOLTIPS_TITLE = "Bienvenue dans l'application de géo-localisation !";
    public static final String TOOLTIPS_MESSAGE = "Capteurs sensori-moteurs sur smartphone et vie quotidienne\n"+
            "Thèse en informatique\n" +
            "Doctorante : Marion Kissous\n" +
            "Réalisée sous la direction de Gérard Dray, Sophie Martin, Anne-Lise Courbis et Thomas Lambolais\n"+
            "\n" +
            "Objectif de l’étude \n" +
            "\n" +
            "Ce projet de recherche s’inscrit a pour objectif est d’explorer si les capteurs sensori-moteurs intégrés dans les " +
            "smartphones permettent de déceler des changements durant la vie quotidienne. Nous nous intéressons plus " +
            "particulièrement aux données du type géo-localisation, analyse vocale et variation du rythme de la marche. " +
            "Notre hypothèse est que l’ensemble de ces indicateurs permettront de refléter des modifications comportementales " +
            "inhérentes aux situations quotidiennes qui sont couteuses en ressources personnelles. L’étude à laquelle nous vous " +
            "proposons de participer a pour objectif de tester la fonctionnalité d’une version prototype de l’application qui " +
            "sera ultérieurement développée.\n"+
            "\n"+
            "Si vous acceptez de participer\n" +
            "\n" +
            "- Vous devrez remplir un questionnaire en début d’étude (essentiellement à visée de récolte de données " +
            "sociodémographiques) \n" +
            "- Vous devrez alors remplir un questionnaire mensuel visant 1) à évaluer des dimensions du quotidiens et 2) à " +
            "repérer si des évènements mineurs ou majeurs ont eu lieu durant le mois passé. Vous aurez aussi à lire de courts " +
            "textes.\n" +
            "- Enfin, nous pourrons être amenés à nous entretenir avec vous au cours de l’étude dans le but de comprendre au " +
            "mieux certaines données relevées.\n" +
            "- SI vous vous engagez à participer, nous comptons sur votre aide et votre bienveillance pour réaliser l’ensemble " +
            "des étapes proposées.\n"+
            "\n" +
            "La protection de vos données est notre priorité\n"+
            "\n"+
            "Votre participation à cette étude est volontaire. Vous pourrez cesser d’y participer à tout moment, sans aucune " +
            "incidence pour vous. En revanche, en cas de retrait, l’ensemble de vos données deviendraient inexploitables pour " +
            "notre recherche. \n"+
            "Conformément aux dispositions de la loi Informatique et Libertés, les participants disposent du droit à demander " +
            "la suppression de leurs données. Si tel était le cas, il vous suffit de contacter la doctorante Marion Kissous " +
            ": marion.kissous@mines-ales.fr\n"+
            "Concernant les données recueillies, elles seront au début nominatives afin de vous permettre de les supprimer si " +
            "tel est votre souhait Les données seront ensuite traitées via des logiciels tels que Excel ou R grâce à des numéros " +
            "aléatoires et ne contiendront donc ainsi aucune information permettant de vous identifier. Ces données seront " +
            "traitées de façon à respecter l’anonymat.\n"+
            "Le stockage et la sauvegarde de ces données se fera sur les serveurs sécurisés des laboratoires engagés dans " +
            "cette recherche. Seuls la doctorante et son équipe encadrante auront un accès direct aux données. " +
            "Vous pourrez nous solliciter si vous souhaitez connaître les résultats de cette étude et vous aider à les " +
            "comprendre.\n"+
            "Marion Kissous se tiendra à votre disposition si vous avez des questions concernant le sujet de recherche et de " +
            "ses débouchés tout au long de l’étude. Les résultats finaux de cette recherche seront diffusés au cours de " +
            "différentes communications telles que des congrès, soutenance de thèse, publications, conférences ou encore " +
            "colloques.\n" +
            "\n" +
            "CONSENTEMENT ÉCLAIRÉ\n" +
            "\n" +
            "J’accepte de mon plein gré de participer à cette étude intitulée « Capteurs sensori-moteurs sur smartphone & " +
            "vie quotidienne », réalisée par Marion Kissous, Doctorante en 2nde année au LGI2P de l’IMT Mines Alès et du " +
            "Laboratoire de psychologie EPSYLON de l’université de Montpellier. Les raisons de cette étude m’ont été exposées " +
            "et les conditions de sa réalisation m’ont été clairement indiquées. Je connais la possibilité qui m’est réservée " +
            "à tout moment d’interrompre ma participation sans en fournir la raison et sans que cela ne me porte préjudice. " +
            "J’ai également été informé(e) que je peux en conséquence demander la suppression de mes données.\n" +
            "J’ai été avisé(e) que je ne recevrai aucune indemnité financière pour ma participation et que les données de " +
            "cette étude préserveront totalement mon anonymat, la confidentialité, et le secret professionnel pour toutes " +
            "informations me concernant.\n" +
            "En application de la loi « informatique et liberté » du 6 janvier 1978, modifiée par les lois n° 94-548 " +
            "du 1er juillet 1994, n° 2002-303 du 4 mars 2002, et 2004-801 du 6 août 2004, j’accepte que les données " +
            "enregistrées à l’occasion de cette étude, puissent faire l’objet d’un traitement informatique, l’anonymat et " +
            "la confidentialité restant totalement respectés.\n" +
            "\n" +
            "« J’accepte de participer à cette présente recherche ce qui présuppose d’utiliser les applications demandées " +
            "(StepAnalyzer, LocationTracker & VoiceAnalysis) ainsi que de répondre aux questionnaires pour lesquels vous " +
            "serez sollicités ».\n";

    public static final String TITLE_LEGAL = "Conditions de participation";
    public static final String INFO_LEGAL = "Capteurs sensori-moteurs sur smartphone et vie quotidienne\n"+
            "Thèse en informatique\n" +
            "Doctorante : Marion Kissous\n" +
            "Réalisée sous la direction de Gérard Dray, Sophie Martin, Anne-Lise Courbis et Thomas Lambolais\n"+
            "\n" +
            "Objectif de l’étude \n" +
            "\n" +
            "Ce projet de recherche s’inscrit a pour objectif est d’explorer si les capteurs sensori-moteurs intégrés dans les " +
            "smartphones permettent de déceler des changements durant la vie quotidienne. Nous nous intéressons plus " +
            "particulièrement aux données du type géo-localisation, analyse vocale et variation du rythme de la marche. " +
            "Notre hypothèse est que l’ensemble de ces indicateurs permettront de refléter des modifications comportementales " +
            "inhérentes aux situations quotidiennes qui sont couteuses en ressources personnelles. L’étude à laquelle nous vous " +
            "proposons de participer a pour objectif de tester la fonctionnalité d’une version prototype de l’application qui " +
            "sera ultérieurement développée.\n"+
            "\n"+
            "Si vous acceptez de participer\n" +
            "\n" +
            "- Vous devrez remplir un questionnaire en début d’étude (essentiellement à visée de récolte de données " +
            "sociodémographiques) \n" +
            "- Vous devrez alors remplir un questionnaire mensuel visant 1) à évaluer des dimensions du quotidiens et 2) à " +
            "repérer si des évènements mineurs ou majeurs ont eu lieu durant le mois passé. Vous aurez aussi à lire de courts " +
            "textes.\n" +
            "- Enfin, nous pourrons être amenés à nous entretenir avec vous au cours de l’étude dans le but de comprendre au " +
            "mieux certaines données relevées.\n" +
            "- SI vous vous engagez à participer, nous comptons sur votre aide et votre bienveillance pour réaliser l’ensemble " +
            "des étapes proposées.\n"+
            "\n" +
            "La protection de vos données est notre priorité\n"+
            "\n"+
            "Votre participation à cette étude est volontaire. Vous pourrez cesser d’y participer à tout moment, sans aucune " +
            "incidence pour vous. En revanche, en cas de retrait, l’ensemble de vos données deviendraient inexploitables pour " +
            "notre recherche. \n"+
            "Conformément aux dispositions de la loi Informatique et Libertés, les participants disposent du droit à demander " +
            "la suppression de leurs données. Si tel était le cas, il vous suffit de contacter la doctorante Marion Kissous " +
            ": marion.kissous@mines-ales.fr\n"+
            "Concernant les données recueillies, elles seront au début nominatives afin de vous permettre de les supprimer si " +
            "tel est votre souhait Les données seront ensuite traitées via des logiciels tels que Excel ou R grâce à des numéros " +
            "aléatoires et ne contiendront donc ainsi aucune information permettant de vous identifier. Ces données seront " +
            "traitées de façon à respecter l’anonymat.\n"+
            "Le stockage et la sauvegarde de ces données se fera sur les serveurs sécurisés des laboratoires engagés dans " +
            "cette recherche. Seuls la doctorante et son équipe encadrante auront un accès direct aux données. " +
            "Vous pourrez nous solliciter si vous souhaitez connaître les résultats de cette étude et vous aider à les " +
            "comprendre.\n"+
            "Marion Kissous se tiendra à votre disposition si vous avez des questions concernant le sujet de recherche et de " +
            "ses débouchés tout au long de l’étude. Les résultats finaux de cette recherche seront diffusés au cours de " +
            "différentes communications telles que des congrès, soutenance de thèse, publications, conférences ou encore " +
            "colloques.\n" +
            "\n" +
            "CONSENTEMENT ÉCLAIRÉ\n" +
            "\n" +
            "J’accepte de mon plein gré de participer à cette étude intitulée « Capteurs sensori-moteurs sur smartphone & " +
            "vie quotidienne », réalisée par Marion Kissous, Doctorante en 2nde année au LGI2P de l’IMT Mines Alès et du " +
            "Laboratoire de psychologie EPSYLON de l’université de Montpellier. Les raisons de cette étude m’ont été exposées " +
            "et les conditions de sa réalisation m’ont été clairement indiquées. Je connais la possibilité qui m’est réservée " +
            "à tout moment d’interrompre ma participation sans en fournir la raison et sans que cela ne me porte préjudice. " +
            "J’ai également été informé(e) que je peux en conséquence demander la suppression de mes données.\n" +
            "J’ai été avisé(e) que je ne recevrai aucune indemnité financière pour ma participation et que les données de " +
            "cette étude préserveront totalement mon anonymat, la confidentialité, et le secret professionnel pour toutes " +
            "informations me concernant.\n" +
            "En application de la loi « informatique et liberté » du 6 janvier 1978, modifiée par les lois n° 94-548 " +
            "du 1er juillet 1994, n° 2002-303 du 4 mars 2002, et 2004-801 du 6 août 2004, j’accepte que les données " +
            "enregistrées à l’occasion de cette étude, puissent faire l’objet d’un traitement informatique, l’anonymat et " +
            "la confidentialité restant totalement respectés.\n" +
            "\n" +
            "« J’accepte de participer à cette présente recherche ce qui présuppose d’utiliser les applications demandées " +
            "(StepAnalyzer, LocationTracker & VoiceAnalysis) ainsi que de répondre aux questionnaires pour lesquels vous " +
            "serez sollicités ».\n";

}
