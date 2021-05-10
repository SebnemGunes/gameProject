package Abstracts;

import Entities.Campaign;

public interface CampaignService {
    public void campaignEntry(Campaign campaign);
    public void campaignDelete(Campaign campaign);
    public void campaignUpdate(Campaign campaign);
    public void addAll(Campaign[] campaigns);
}
