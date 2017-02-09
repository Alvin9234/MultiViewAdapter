package com.ahamed.sample.common.binder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ahamed.multiviewadapter.BaseBinder;
import com.ahamed.multiviewadapter.BaseViewHolder;
import com.ahamed.sample.R;
import com.ahamed.sample.common.model.ItemTwo;

public class ItemTwoBinder extends BaseBinder<ItemTwo, ItemTwoBinder.ItemViewHolder> {

  @Override public ItemViewHolder create(LayoutInflater layoutInflater, ViewGroup parent) {
    return new ItemViewHolder(layoutInflater.inflate(R.layout.item_two, parent, false));
  }

  @Override public void bind(ItemViewHolder holder, ItemTwo item) {
    holder.textView.setText(item.getData());
  }

  @Override public Class<ItemTwo> getType() {
    return ItemTwo.class;
  }

  @Override public int getSpanSize(int maxSpanCount) {
    return maxSpanCount;
  }

  static class ItemViewHolder extends BaseViewHolder<ItemTwo> {

    private TextView textView;

    ItemViewHolder(View itemView) {
      super(itemView);
      textView = (TextView) itemView.findViewById(R.id.tv_content);
    }
  }
}