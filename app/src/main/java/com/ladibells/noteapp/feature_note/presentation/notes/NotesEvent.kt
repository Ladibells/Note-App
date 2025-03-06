package com.ladibells.noteapp.feature_note.presentation.notes

import com.ladibells.noteapp.feature_note.domain.model.Note
import com.ladibells.noteapp.feature_note.presentation.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note) : NotesEvent()
    object RestoreNote : NotesEvent()
    object ToggleOrderSection : NotesEvent()
}