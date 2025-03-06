package com.ladibells.noteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ladibells.noteapp.R
import com.ladibells.noteapp.feature_note.presentation.util.NoteOrder
import com.ladibells.noteapp.feature_note.presentation.util.OrderType

@Composable
fun OrderSection (
    modifier: Modifier = Modifier,
    noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    onOrderChange: (NoteOrder) -> Unit
) {
    Column (
        modifier = modifier,

    ) {
        Row (
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaulradioButton(
                text = stringResource(R.string.title),
                selected = noteOrder is NoteOrder.Title,
                onSelect = { onOrderChange(NoteOrder.Title(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaulradioButton(
                text = stringResource(R.string.date),
                selected = noteOrder is NoteOrder.Date,
                onSelect = { onOrderChange(NoteOrder.Date(noteOrder.orderType)) }
            )
            Spacer(modifier = Modifier.width(8.dp))
            DefaulradioButton(
                text = stringResource(R.string.color),
                selected = noteOrder is NoteOrder.Color,
                onSelect = { onOrderChange(NoteOrder.Color(noteOrder.orderType)) }
            )
        }
        Spacer(modifier = Modifier.width(16.dp))
        Row (
            modifier = Modifier.fillMaxWidth()
        ) {
            DefaulradioButton(
                text = stringResource(R.string.ascending),
                selected = noteOrder.orderType is OrderType.Ascending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Ascending))
                }
            )

            Spacer(modifier = Modifier.width(8.dp))

            DefaulradioButton(
                text = stringResource(R.string.descending),
                selected = noteOrder.orderType is OrderType.Descending,
                onSelect = {
                    onOrderChange(noteOrder.copy(OrderType.Descending))
                }
            )
        }
    }
}