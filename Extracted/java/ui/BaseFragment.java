.class public Lorg/adaway/ui/BaseFragment;
.super Lcom/actionbarsherlock/app/SherlockFragment;
.source "BaseFragment.java"


# instance fields
.field private mActivity:Landroid/support/v4/app/FragmentActivity;

.field private mApplyButton:Landroid/widget/Button;

.field private mCurrentButtonsDisabled:Z

.field private mCurrentStatusIconStatus:I

.field private mCurrentStatusText:Ljava/lang/String;

.field private mCurrentStatusTitle:Ljava/lang/String;

.field private mRevertButton:Landroid/widget/Button;

.field private mStatusIcon:Landroid/widget/ImageView;

.field private mStatusProgress:Landroid/widget/ProgressBar;

.field private mStatusText:Landroid/widget/TextView;

.field private mStatusTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 49
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockFragment;-><init>()V

    return-void
.end method

.method private setStatusIcon(I)V
    .registers 5
    .param p1, "iconStatus"    # I

    .prologue
    const/16 v1, 0x8

    const/4 v2, 0x0

    .line 71
    packed-switch p1, :pswitch_data_5e

    .line 100
    :goto_6
    :pswitch_6
    return-void

    .line 73
    :pswitch_7
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 75
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    const v1, 0x7f020089

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_6

    .line 78
    :pswitch_1a
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 79
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 80
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    const v1, 0x7f020087

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_6

    .line 83
    :pswitch_2d
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 84
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 85
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    const v1, 0x7f020086

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_6

    .line 88
    :pswitch_40
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 89
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    const v1, 0x7f020088

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 90
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_6

    .line 93
    :pswitch_53
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 94
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_6

    .line 71
    :pswitch_data_5e
    .packed-switch 0x0
        :pswitch_53
        :pswitch_6
        :pswitch_6
        :pswitch_7
        :pswitch_1a
        :pswitch_2d
        :pswitch_40
    .end packed-switch
.end method


# virtual methods
.method public applyOnClick(Landroid/view/View;)V
    .registers 4
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 250
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v1, Lorg/adaway/service/ApplyService;

    invoke-static {v0, v1}, Lcom/commonsware/cwac/wakeful/WakefulIntentService;->sendWakefulWork(Landroid/content/Context;Ljava/lang/Class;)V

    .line 251
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .registers 8
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 211
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreate(Landroid/os/Bundle;)V

    .line 213
    invoke-virtual {p0}, Lorg/adaway/ui/BaseFragment;->getSherlockActivity()Lcom/actionbarsherlock/app/SherlockFragmentActivity;

    move-result-object v4

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    .line 215
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e003a

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mStatusTitle:Landroid/widget/TextView;

    .line 216
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e003b

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mStatusText:Landroid/widget/TextView;

    .line 217
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e0038

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ProgressBar;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mStatusProgress:Landroid/widget/ProgressBar;

    .line 218
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e0039

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mStatusIcon:Landroid/widget/ImageView;

    .line 219
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e003c

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mApplyButton:Landroid/widget/Button;

    .line 220
    iget-object v4, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const v5, 0x7f0e003d

    invoke-virtual {v4, v5}, Landroid/support/v4/app/FragmentActivity;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    iput-object v4, p0, Lorg/adaway/ui/BaseFragment;->mRevertButton:Landroid/widget/Button;

    .line 223
    if-eqz p1, :cond_85

    .line 224
    const-string v4, "AdAway"

    const-string v5, "BaseFragment coming from an orientation change!"

    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 226
    const-string v4, "statusTitle"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 227
    .local v3, "title":Ljava/lang/String;
    const-string v4, "statusText"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 228
    .local v2, "text":Ljava/lang/String;
    const-string v4, "statusIconStatus"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 229
    .local v1, "iconStatus":I
    if-eqz v3, :cond_7c

    if-eqz v2, :cond_7c

    const/4 v4, -0x1

    if-eq v1, v4, :cond_7c

    .line 230
    invoke-virtual {p0, v3, v2, v1}, Lorg/adaway/ui/BaseFragment;->setStatus(Ljava/lang/String;Ljava/lang/String;I)V

    .line 233
    :cond_7c
    const-string v4, "buttonsEnabled"

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 234
    .local v0, "buttonsDisabled":Z
    invoke-virtual {p0, v0}, Lorg/adaway/ui/BaseFragment;->setButtonsDisabled(Z)V

    .line 236
    .end local v0    # "buttonsDisabled":Z
    .end local v1    # "iconStatus":I
    .end local v2    # "text":Ljava/lang/String;
    .end local v3    # "title":Ljava/lang/String;
    :cond_85
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .registers 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 240
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreate(Landroid/os/Bundle;)V

    .line 241
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/adaway/ui/BaseFragment;->setHasOptionsMenu(Z)V

    .line 242
    return-void
.end method

.method public onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V
    .registers 4
    .param p1, "menu"    # Lcom/actionbarsherlock/view/Menu;
    .param p2, "inflater"    # Lcom/actionbarsherlock/view/MenuInflater;

    .prologue
    .line 148
    invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/app/SherlockFragment;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;Lcom/actionbarsherlock/view/MenuInflater;)V

    .line 149
    const/high16 v0, 0x7f0f0000

    invoke-virtual {p2, v0, p1}, Lcom/actionbarsherlock/view/MenuInflater;->inflate(ILcom/actionbarsherlock/view/Menu;)V

    .line 150
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 6
    .param p1, "inflater"    # Landroid/view/LayoutInflater;
    .param p2, "container"    # Landroid/view/ViewGroup;
    .param p3, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 203
    const v0, 0x7f040016

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .registers 7
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v1, 0x1

    .line 158
    invoke-interface {p1}, Lcom/actionbarsherlock/view/MenuItem;->getItemId()I

    move-result v2

    packed-switch v2, :pswitch_data_76

    .line 194
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z

    move-result v1

    :goto_c
    return v1

    .line 160
    :pswitch_d
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/HostsSourcesActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 164
    :pswitch_1a
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/ListsActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 168
    :pswitch_27
    iget-object v2, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v2}, Lorg/adaway/helper/OpenHelper;->openHostsFile(Landroid/support/v4/app/FragmentActivity;)V

    goto :goto_c

    .line 172
    :pswitch_2d
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/TcpdumpActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 176
    :pswitch_3a
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/PrefsActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 180
    :pswitch_47
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/ScanAdwareActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 184
    :pswitch_54
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v3, Lorg/adaway/service/UpdateService;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 185
    .local v0, "updateIntent":Landroid/content/Intent;
    const-string v2, "org.adaway.BACKGROUND_EXECUTION"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 186
    iget-object v2, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    invoke-static {v2, v0}, Lcom/commonsware/cwac/wakeful/WakefulIntentService;->sendWakefulWork(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_c

    .line 190
    .end local v0    # "updateIntent":Landroid/content/Intent;
    :pswitch_69
    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v4, Lorg/adaway/ui/HelpActivity;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v2}, Lorg/adaway/ui/BaseFragment;->startActivity(Landroid/content/Intent;)V

    goto :goto_c

    .line 158
    :pswitch_data_76
    .packed-switch 0x7f0e0061
        :pswitch_d
        :pswitch_1a
        :pswitch_27
        :pswitch_2d
        :pswitch_47
        :pswitch_3a
        :pswitch_54
        :pswitch_69
    .end packed-switch
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 4
    .param p1, "outState"    # Landroid/os/Bundle;

    .prologue
    .line 134
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 137
    const-string v0, "statusTitle"

    iget-object v1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusTitle:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    const-string v0, "statusText"

    iget-object v1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusText:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    const-string v0, "statusIconStatus"

    iget v1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusIconStatus:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 140
    const-string v0, "buttonsEnabled"

    iget-boolean v1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentButtonsDisabled:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 141
    return-void
.end method

.method public revertOnClick(Landroid/view/View;)V
    .registers 4
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 259
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mActivity:Landroid/support/v4/app/FragmentActivity;

    const-class v1, Lorg/adaway/service/RevertService;

    invoke-static {v0, v1}, Lcom/commonsware/cwac/wakeful/WakefulIntentService;->sendWakefulWork(Landroid/content/Context;Ljava/lang/Class;)V

    .line 260
    return-void
.end method

.method public setButtonsDisabled(Z)V
    .registers 6
    .param p1, "buttonsDisabled"    # Z

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 121
    iget-object v3, p0, Lorg/adaway/ui/BaseFragment;->mApplyButton:Landroid/widget/Button;

    if-nez p1, :cond_14

    move v0, v1

    :goto_7
    invoke-virtual {v3, v0}, Landroid/widget/Button;->setEnabled(Z)V

    .line 122
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mRevertButton:Landroid/widget/Button;

    if-nez p1, :cond_16

    :goto_e
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 125
    iput-boolean p1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentButtonsDisabled:Z

    .line 126
    return-void

    :cond_14
    move v0, v2

    .line 121
    goto :goto_7

    :cond_16
    move v1, v2

    .line 122
    goto :goto_e
.end method

.method public setStatus(Ljava/lang/String;Ljava/lang/String;I)V
    .registers 5
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "text"    # Ljava/lang/String;
    .param p3, "iconStatus"    # I

    .prologue
    .line 110
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusTitle:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lorg/adaway/ui/BaseFragment;->mStatusText:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    invoke-direct {p0, p3}, Lorg/adaway/ui/BaseFragment;->setStatusIcon(I)V

    .line 115
    iput-object p1, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusTitle:Ljava/lang/String;

    .line 116
    iput-object p2, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusText:Ljava/lang/String;

    .line 117
    iput p3, p0, Lorg/adaway/ui/BaseFragment;->mCurrentStatusIconStatus:I

    .line 118
    return-void
.end method
