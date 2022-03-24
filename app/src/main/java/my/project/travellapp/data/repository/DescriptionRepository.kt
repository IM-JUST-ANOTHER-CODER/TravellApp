package my.project.travellapp.data.repository

import my.project.travellapp.data.localDB.DescriptionDao
import my.project.travellapp.data.models.DescriptionModel
import my.project.travellapp.domain.repository.DescriptionCall
import my.project.travellapp.domain.repository.ToursCall

class DescriptionRepository(private val oad: DescriptionDao) : DescriptionCall {

    override suspend fun insertDescription(descriptionModel: DescriptionModel) {
        oad.insertDescription(descriptionModel)
    }

}