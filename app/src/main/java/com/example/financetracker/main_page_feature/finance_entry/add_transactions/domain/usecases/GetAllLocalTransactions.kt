package com.example.financetracker.main_page_feature.finance_entry.add_transactions.domain.usecases

import com.example.financetracker.main_page_feature.finance_entry.add_transactions.domain.model.Transactions
import com.example.financetracker.main_page_feature.finance_entry.add_transactions.domain.repository.TransactionLocalRepository
import kotlinx.coroutines.flow.Flow

class GetAllLocalTransactions(
    private val transactionLocalRepository: TransactionLocalRepository
) {
    suspend operator fun invoke(uid: String): Flow<List<Transactions>>{
        return transactionLocalRepository.getAllLocalTransactions(uid = uid)
    }
}