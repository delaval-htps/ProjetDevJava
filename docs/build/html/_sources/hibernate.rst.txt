*********
hibernate
*********

une erreur monumentale !!!

HQL works with the class names not with table names!

So you have to write:

List<GifModel> textList = session.createQuery("from GifModel").list();

Can not set char field fr.doriandelaval.entity.Client.etatCustomer to null value
