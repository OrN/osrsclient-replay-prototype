import java.util.Collection;
import java.util.Iterator;

// $FF: renamed from: ki
public class class_323 implements Iterable, Collection {

   // $FF: renamed from: n mw
   class_27 field_3810;
   // $FF: renamed from: v mw
   class_27 field_3811;


    // $FF: renamed from: v () void
   public void method_5696() {
      while(this.field_3811.field_10 != this.field_3811) {
         this.field_3811.field_10.method_108();
      }

   }

   // $FF: renamed from: n (mw) void
   public void method_5697(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811.field_11;
      var1.field_10 = this.field_3811;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

   // $FF: renamed from: f (mw) void
   public void method_5698(class_27 var1) {
      if(var1.field_11 != null) {
         var1.method_108();
      }

      var1.field_11 = this.field_3811;
      var1.field_10 = this.field_3811.field_10;
      var1.field_11.field_10 = var1;
      var1.field_10.field_11 = var1;
   }

    // $FF: renamed from: p () mw
   public class_27 method_5700() {
      return this.method_5701((class_27)null);
   }

   // $FF: renamed from: j (mw) mw
   class_27 method_5701(class_27 var1) {
      class_27 var2;
      if(var1 == null) {
         var2 = this.field_3811.field_10;
      } else {
         var2 = var1;
      }

      if(var2 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var2.field_10;
         return var2;
      }
   }

   // $FF: renamed from: r () mw
   public class_27 method_5702() {
      class_27 var1 = this.field_3810;
      if(var1 == this.field_3811) {
         this.field_3810 = null;
         return null;
      } else {
         this.field_3810 = var1.field_10;
         return var1;
      }
   }

   // $FF: renamed from: b () int
   int method_5703() {
      int var1 = 0;

      for(class_27 var2 = this.field_3811.field_10; var2 != this.field_3811; var2 = var2.field_10) {
         ++var1;
      }

      return var1;
   }

   // $FF: renamed from: d () boolean
   public boolean method_5704() {
      return this.field_3811.field_10 == this.field_3811;
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      class_330 var10000 = new class_330(this);
      return var10000;
   }

    public boolean isEmpty() {
      return this.method_5704();
   }

    public Object[] toArray() {
      return this.method_5708();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

   // $FF: renamed from: u (mw) boolean
   boolean method_5707(class_27 var1) {
      this.method_5697(var1);
      return true;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   // $FF: renamed from: s () mw[]
   class_27[] method_5708() {
      class_27[] var1 = new class_27[this.method_5703()];
      int var2 = 0;

      for(class_27 var3 = this.field_3811.field_10; var3 != this.field_3811; var3 = var3.field_10) {
         var1[var2++] = var3;
      }

      return var1;
   }

    public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method_5696();
   }

    public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

    public boolean add(Object var1) {
      return this.method_5707((class_27)var1);
   }

    public int size() {
      return this.method_5703();
   }

    // $FF: renamed from: <init> () void
   public class_323() {
      super();
      class_27 var10001 = new class_27();
      this.field_3811 = var10001;
      this.field_3811.field_10 = this.field_3811;
      this.field_3811.field_11 = this.field_3811;
   }

    public boolean contains(Object var1) {
      throw new RuntimeException();
   }

    // $FF: renamed from: y (mw, mw) void
   public static void method_5743(class_27 var0, class_27 var1) {
      if(var0.field_11 != null) {
         var0.method_108();
      }

      var0.field_11 = var1;
      var0.field_10 = var1.field_10;
      var0.field_11.field_10 = var0;
      var0.field_10.field_11 = var0;
   }

    public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

}
