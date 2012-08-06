
function deleteConfirm(id){
	if (!window.confirm(id + 'を削除してよろしいですか？')) {
		return false;
	}
}