package Concrete;

import Abstracts.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void campaignEntry(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası oluşturuldu!");
    }

    @Override
    public void campaignDelete(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası güncellendi!");

    }

    @Override
    public void campaignUpdate(Campaign campaign) {
        System.out.println(campaign.getCampaignName()+" kampanyası silindi!");

    }

    @Override
    public void addAll(Campaign[] campaigns) {
        System.out.println("Mevcut tüm kampanyalar: ");
         for (Campaign campaign: campaigns){
             System.out.println(campaign.getCampaignName());
         }
    }
}
