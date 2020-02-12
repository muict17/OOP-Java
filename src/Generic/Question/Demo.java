package Generic.Question;

public class Demo {
    public static void main(String[] args){
        CodContent cod = new CodContent("tar industry",10,"2019/02/12","Transfer Roses");

        Message<CodContent> codContentMessage = new Message<CodContent>();
        codContentMessage.setName("send gun to Tar industry");
        codContentMessage.setContent(cod);

        NormalContent normalContent = new NormalContent("Someone","Happy valentine");
        Message<NormalContent> normalContentMessage = new Message<NormalContent>();
        normalContentMessage.setName("send a message to Someone");
        normalContentMessage.setContent(normalContent);

        System.out.println("Send COD message");
        System.out.println("Send to: " + codContentMessage.getContent().getCompanyName());
        System.out.println("Topic: " + codContentMessage.getName());
        System.out.println("Amount: "+codContentMessage.getContent().getAmount());
        System.out.println("Content: " + codContentMessage.getContent().getAmount());


        System.out.println("\n");


        System.out.println("Send Normal message");
        System.out.println("Send to: " + normalContentMessage.getContent().getReceiverName());
        System.out.println("Topic: " + normalContentMessage.getName());
        System.out.println("Content: " + normalContentMessage.getContent().getMessage());

    }
}
