package by.stepovoy.parsers;

import by.stepovoy.entity.Category;
import by.stepovoy.entity.Cost;
import by.stepovoy.entity.Office;
import by.stepovoy.entity.Product;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class MyHandler extends DefaultHandler {

    private static final String OFFICE_TAG = "office";
    private static final String CATEGORY_TAG = "category";
    private static final String PRODUCT_TAG = "product";
    private static final String TYPE_TAG = "type";
    private static final String COMPANY_TAG = "company";
    private static final String COUNTRY_TAG = "country";
    private static final String PURPOSE_TAG = "purpose";
    private static final String COST_TAG = "cost";

    private static final String OFFICE_ATTRIBUTE = "name";
    private static final String CATEGORY_ATTRIBUTE = "name";
    private static final String PRODUCT_ATTRIBUTE = "id";
    private static final String COST_ATTRIBUTE = "currency";

    private Office office;
    private Category category;
    private Product product;
    private String currentElement;


    public Office getOffice() {
        return office;
    }

    @Override
    public void startDocument() {
        System.out.println("Starting SAX parsing XML file...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        currentElement = qName;

        switch (currentElement) {
            case OFFICE_TAG: {
                office = new Office();
                office.setName(attributes.getValue(OFFICE_ATTRIBUTE));
                office.setCategoryList(new ArrayList<Category>());

                break;
            }
            case CATEGORY_TAG: {
                category = new Category();
                category.setListProducts(new ArrayList<Product>());

                if (category.getNameCategory() == null) {
                    category.setNameCategory(attributes.getValue(CATEGORY_ATTRIBUTE));
                }
                break;
            }
            case PRODUCT_TAG: {
                product = new Product();
                product.setId(Integer.valueOf(attributes.getValue(PRODUCT_ATTRIBUTE)));
                break;
            }
            case COST_TAG: {
                product.setCost(new Cost());
                product.getCost().setCurrency(attributes.getValue(COST_ATTRIBUTE));
            }
            default:

        }
    }

    @Override
    public void characters(char[] chars, int start, int length) {
        String text = new String(chars, start, length);

        if (text.contains("<") || currentElement == null) {
            return;
        }

        switch (currentElement) {
            case TYPE_TAG: {
                product.setType(text);
                break;
            }
            case COMPANY_TAG: {
                product.setCompany(text);
                break;
            }
            case COUNTRY_TAG: {
                product.setCountry(text);
                break;
            }
            case PURPOSE_TAG: {
                product.setPurpose(text);
                break;
            }
            case COST_TAG: {
                product.getCost().setValue(Double.valueOf(text));
                break;
            }
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case PRODUCT_TAG: {
                category.getListProducts().add(product);

                //currentElement = null;
                break;
            }
            case CATEGORY_TAG:{
                office.getCategoryList().add(category);
                break;
            }
            default:

        }
        currentElement = null;
    }

    public void endDocument() {
        System.out.println("SAX parsing of XML file completed!");
    }


}
