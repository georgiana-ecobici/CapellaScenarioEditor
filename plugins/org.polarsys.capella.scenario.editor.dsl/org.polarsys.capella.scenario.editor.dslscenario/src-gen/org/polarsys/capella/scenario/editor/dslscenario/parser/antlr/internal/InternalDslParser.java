package org.polarsys.capella.scenario.editor.dslscenario.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'}'", "'System'", "'IS'", "'ES'", "'{'", "'Logical'", "'Physical'", "'FS'", "'EPBS'", "'OAS'", "'OES'", "'actor'", "'as'", "'component'", "'unset'", "'behavior'", "'node'", "'configuration_item'", "'function'", "'activity'", "'entity'", "'role'", "'->'", "':'", "'->+'", "'->x'", "'<--'", "'->>'", "'deactivate'", "'ref'", "'over'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_scenarioType_1_0 = null;

        EObject lv_messagesOrReferences_2_1 = null;

        EObject lv_messagesOrReferences_2_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )* otherlv_3= '}' ) )
            // InternalDsl.g:78:2: (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )* otherlv_3= '}' )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )* otherlv_3= '}' )
            // InternalDsl.g:79:3: otherlv_0= 'scenario' ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) ) ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getScenarioKeyword_0());
            		
            // InternalDsl.g:83:3: ( (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants ) )
            // InternalDsl.g:84:4: (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants )
            {
            // InternalDsl.g:84:4: (lv_scenarioType_1_0= ruleScenarioTypeAndParticipants )
            // InternalDsl.g:85:5: lv_scenarioType_1_0= ruleScenarioTypeAndParticipants
            {

            					newCompositeNode(grammarAccess.getModelAccess().getScenarioTypeScenarioTypeAndParticipantsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_scenarioType_1_0=ruleScenarioTypeAndParticipants();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"scenarioType",
            						lv_scenarioType_1_0,
            						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.ScenarioTypeAndParticipants");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:102:3: ( ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=39 && LA2_0<=41)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:103:4: ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) )
            	    {
            	    // InternalDsl.g:103:4: ( (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference ) )
            	    // InternalDsl.g:104:5: (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference )
            	    {
            	    // InternalDsl.g:104:5: (lv_messagesOrReferences_2_1= ruleMessage | lv_messagesOrReferences_2_2= ruleReference )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_ID||(LA1_0>=39 && LA1_0<=40)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==41) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalDsl.g:105:6: lv_messagesOrReferences_2_1= ruleMessage
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getMessagesOrReferencesMessageParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_messagesOrReferences_2_1=ruleMessage();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"messagesOrReferences",
            	            							lv_messagesOrReferences_2_1,
            	            							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Message");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:121:6: lv_messagesOrReferences_2_2= ruleReference
            	            {

            	            						newCompositeNode(grammarAccess.getModelAccess().getMessagesOrReferencesReferenceParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_4);
            	            lv_messagesOrReferences_2_2=ruleReference();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getModelRule());
            	            						}
            	            						add(
            	            							current,
            	            							"messagesOrReferences",
            	            							lv_messagesOrReferences_2_2,
            	            							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Reference");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenarioTypeAndParticipants"
    // InternalDsl.g:147:1: entryRuleScenarioTypeAndParticipants returns [EObject current=null] : iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF ;
    public final EObject entryRuleScenarioTypeAndParticipants() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioTypeAndParticipants = null;


        try {
            // InternalDsl.g:147:68: (iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF )
            // InternalDsl.g:148:2: iv_ruleScenarioTypeAndParticipants= ruleScenarioTypeAndParticipants EOF
            {
             newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenarioTypeAndParticipants=ruleScenarioTypeAndParticipants();

            state._fsp--;

             current =iv_ruleScenarioTypeAndParticipants; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenarioTypeAndParticipants"


    // $ANTLR start "ruleScenarioTypeAndParticipants"
    // InternalDsl.g:154:1: ruleScenarioTypeAndParticipants returns [EObject current=null] : ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* ) | (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* ) | (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* ) | (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* ) | (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* ) | (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* ) ) ;
    public final EObject ruleScenarioTypeAndParticipants() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_name_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_name_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_name_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token lv_name_27_0=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token lv_name_31_0=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token lv_name_35_0=null;
        Token otherlv_36=null;
        EObject lv_participants_5_0 = null;

        EObject lv_participants_11_1 = null;

        EObject lv_participants_11_2 = null;

        EObject lv_participant_17_1 = null;

        EObject lv_participant_17_2 = null;

        EObject lv_participants_24_0 = null;

        EObject lv_participants_29_0 = null;

        EObject lv_participants_33_0 = null;

        EObject lv_participants_37_1 = null;

        EObject lv_participants_37_2 = null;

        EObject lv_participants_37_3 = null;



        	enterRule();

        try {
            // InternalDsl.g:160:2: ( ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* ) | (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* ) | (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* ) | (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* ) | (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* ) | (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* ) ) )
            // InternalDsl.g:161:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* ) | (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* ) | (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* ) | (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* ) | (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* ) | (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* ) )
            {
            // InternalDsl.g:161:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* ) | (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* ) | (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* ) | (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* ) | (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* ) | (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* ) )
            int alt17=7;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:162:3: (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* )
                    {
                    // InternalDsl.g:162:3: (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* )
                    // InternalDsl.g:163:4: otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )*
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_0_0());
                    			
                    // InternalDsl.g:167:4: (otherlv_1= 'IS' | otherlv_2= 'ES' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalDsl.g:168:5: otherlv_1= 'IS'
                            {
                            otherlv_1=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_0_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:173:5: otherlv_2= 'ES'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:178:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalDsl.g:179:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:179:5: (lv_name_3_0= RULE_STRING )
                    // InternalDsl.g:180:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_0_3());
                    			
                    // InternalDsl.g:200:4: ( (lv_participants_5_0= ruleActor ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==23) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDsl.g:201:5: (lv_participants_5_0= ruleActor )
                    	    {
                    	    // InternalDsl.g:201:5: (lv_participants_5_0= ruleActor )
                    	    // InternalDsl.g:202:6: lv_participants_5_0= ruleActor
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_0_4_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_participants_5_0=ruleActor();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_5_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:221:3: (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* )
                    {
                    // InternalDsl.g:221:3: (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* )
                    // InternalDsl.g:222:4: otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )*
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_1_0());
                    			
                    // InternalDsl.g:226:4: (otherlv_7= 'IS' | otherlv_8= 'ES' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==14) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==15) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalDsl.g:227:5: otherlv_7= 'IS'
                            {
                            otherlv_7=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:232:5: otherlv_8= 'ES'
                            {
                            otherlv_8=(Token)match(input,15,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:237:4: ( (lv_name_9_0= RULE_STRING ) )
                    // InternalDsl.g:238:5: (lv_name_9_0= RULE_STRING )
                    {
                    // InternalDsl.g:238:5: (lv_name_9_0= RULE_STRING )
                    // InternalDsl.g:239:6: lv_name_9_0= RULE_STRING
                    {
                    lv_name_9_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_9_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_1_3());
                    			
                    // InternalDsl.g:259:4: ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==23||LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDsl.g:260:5: ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) )
                    	    {
                    	    // InternalDsl.g:260:5: ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) )
                    	    // InternalDsl.g:261:6: (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent )
                    	    {
                    	    // InternalDsl.g:261:6: (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent )
                    	    int alt6=2;
                    	    int LA6_0 = input.LA(1);

                    	    if ( (LA6_0==23) ) {
                    	        alt6=1;
                    	    }
                    	    else if ( (LA6_0==25) ) {
                    	        alt6=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 6, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt6) {
                    	        case 1 :
                    	            // InternalDsl.g:262:7: lv_participants_11_1= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_1_4_0_0());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participants_11_1=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_11_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:278:7: lv_participants_11_2= ruleComponent
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsComponentParserRuleCall_1_4_0_1());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participants_11_2=ruleComponent();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_11_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Component");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:298:3: (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* )
                    {
                    // InternalDsl.g:298:3: (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* )
                    // InternalDsl.g:299:4: otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )*
                    {
                    otherlv_12=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_2_0());
                    			
                    // InternalDsl.g:303:4: (otherlv_13= 'IS' | otherlv_14= 'ES' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==14) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==15) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalDsl.g:304:5: otherlv_13= 'IS'
                            {
                            otherlv_13=(Token)match(input,14,FOLLOW_6); 

                            					newLeafNode(otherlv_13, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_2_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:309:5: otherlv_14= 'ES'
                            {
                            otherlv_14=(Token)match(input,15,FOLLOW_6); 

                            					newLeafNode(otherlv_14, grammarAccess.getScenarioTypeAndParticipantsAccess().getESKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalDsl.g:314:4: ( (lv_name_15_0= RULE_STRING ) )
                    // InternalDsl.g:315:5: (lv_name_15_0= RULE_STRING )
                    {
                    // InternalDsl.g:315:5: (lv_name_15_0= RULE_STRING )
                    // InternalDsl.g:316:6: lv_name_15_0= RULE_STRING
                    {
                    lv_name_15_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_15_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_2_3());
                    			
                    // InternalDsl.g:336:4: ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==23||LA10_0==25) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDsl.g:337:5: ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) )
                    	    {
                    	    // InternalDsl.g:337:5: ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) )
                    	    // InternalDsl.g:338:6: (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent )
                    	    {
                    	    // InternalDsl.g:338:6: (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( (LA9_0==23) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==25) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // InternalDsl.g:339:7: lv_participant_17_1= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantActorParserRuleCall_2_4_0_0());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participant_17_1=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participant",
                    	            								lv_participant_17_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:355:7: lv_participant_17_2= rulePhysicalComponent
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantPhysicalComponentParserRuleCall_2_4_0_1());
                    	            						
                    	            pushFollow(FOLLOW_9);
                    	            lv_participant_17_2=rulePhysicalComponent();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participant",
                    	            								lv_participant_17_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.PhysicalComponent");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:375:3: ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* )
                    {
                    // InternalDsl.g:375:3: ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* )
                    // InternalDsl.g:376:4: (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )*
                    {
                    // InternalDsl.g:376:4: (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' )
                    int alt11=3;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt11=1;
                        }
                        break;
                    case 17:
                        {
                        alt11=2;
                        }
                        break;
                    case 18:
                        {
                        alt11=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalDsl.g:377:5: otherlv_18= 'System'
                            {
                            otherlv_18=(Token)match(input,13,FOLLOW_10); 

                            					newLeafNode(otherlv_18, grammarAccess.getScenarioTypeAndParticipantsAccess().getSystemKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:382:5: otherlv_19= 'Logical'
                            {
                            otherlv_19=(Token)match(input,17,FOLLOW_10); 

                            					newLeafNode(otherlv_19, grammarAccess.getScenarioTypeAndParticipantsAccess().getLogicalKeyword_3_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalDsl.g:387:5: otherlv_20= 'Physical'
                            {
                            otherlv_20=(Token)match(input,18,FOLLOW_10); 

                            					newLeafNode(otherlv_20, grammarAccess.getScenarioTypeAndParticipantsAccess().getPhysicalKeyword_3_0_2());
                            				

                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getScenarioTypeAndParticipantsAccess().getFSKeyword_3_1());
                    			
                    // InternalDsl.g:396:4: ( (lv_name_22_0= RULE_STRING ) )
                    // InternalDsl.g:397:5: (lv_name_22_0= RULE_STRING )
                    {
                    // InternalDsl.g:397:5: (lv_name_22_0= RULE_STRING )
                    // InternalDsl.g:398:6: lv_name_22_0= RULE_STRING
                    {
                    lv_name_22_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_22_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_22_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_23=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_3_3());
                    			
                    // InternalDsl.g:418:4: ( (lv_participants_24_0= ruleFunction ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==30) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDsl.g:419:5: (lv_participants_24_0= ruleFunction )
                    	    {
                    	    // InternalDsl.g:419:5: (lv_participants_24_0= ruleFunction )
                    	    // InternalDsl.g:420:6: lv_participants_24_0= ruleFunction
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsFunctionParserRuleCall_3_4_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_participants_24_0=ruleFunction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_24_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Function");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:439:3: (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* )
                    {
                    // InternalDsl.g:439:3: (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* )
                    // InternalDsl.g:440:4: otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )*
                    {
                    otherlv_25=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getScenarioTypeAndParticipantsAccess().getEPBSKeyword_4_0());
                    			
                    otherlv_26=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_26, grammarAccess.getScenarioTypeAndParticipantsAccess().getISKeyword_4_1());
                    			
                    // InternalDsl.g:448:4: ( (lv_name_27_0= RULE_STRING ) )
                    // InternalDsl.g:449:5: (lv_name_27_0= RULE_STRING )
                    {
                    // InternalDsl.g:449:5: (lv_name_27_0= RULE_STRING )
                    // InternalDsl.g:450:6: lv_name_27_0= RULE_STRING
                    {
                    lv_name_27_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_27_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_27_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_28, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_4_3());
                    			
                    // InternalDsl.g:470:4: ( (lv_participants_29_0= ruleConfigurationItem ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==29) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:471:5: (lv_participants_29_0= ruleConfigurationItem )
                    	    {
                    	    // InternalDsl.g:471:5: (lv_participants_29_0= ruleConfigurationItem )
                    	    // InternalDsl.g:472:6: lv_participants_29_0= ruleConfigurationItem
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsConfigurationItemParserRuleCall_4_4_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_participants_29_0=ruleConfigurationItem();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_29_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.ConfigurationItem");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:491:3: (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* )
                    {
                    // InternalDsl.g:491:3: (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* )
                    // InternalDsl.g:492:4: otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )*
                    {
                    otherlv_30=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_30, grammarAccess.getScenarioTypeAndParticipantsAccess().getOASKeyword_5_0());
                    			
                    // InternalDsl.g:496:4: ( (lv_name_31_0= RULE_STRING ) )
                    // InternalDsl.g:497:5: (lv_name_31_0= RULE_STRING )
                    {
                    // InternalDsl.g:497:5: (lv_name_31_0= RULE_STRING )
                    // InternalDsl.g:498:6: lv_name_31_0= RULE_STRING
                    {
                    lv_name_31_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_31_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_31_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_32=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_32, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_5_2());
                    			
                    // InternalDsl.g:518:4: ( (lv_participants_33_0= ruleActivity ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==31) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalDsl.g:519:5: (lv_participants_33_0= ruleActivity )
                    	    {
                    	    // InternalDsl.g:519:5: (lv_participants_33_0= ruleActivity )
                    	    // InternalDsl.g:520:6: lv_participants_33_0= ruleActivity
                    	    {

                    	    						newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActivityParserRuleCall_5_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_participants_33_0=ruleActivity();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"participants",
                    	    							lv_participants_33_0,
                    	    							"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Activity");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:539:3: (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* )
                    {
                    // InternalDsl.g:539:3: (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* )
                    // InternalDsl.g:540:4: otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )*
                    {
                    otherlv_34=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_34, grammarAccess.getScenarioTypeAndParticipantsAccess().getOESKeyword_6_0());
                    			
                    // InternalDsl.g:544:4: ( (lv_name_35_0= RULE_STRING ) )
                    // InternalDsl.g:545:5: (lv_name_35_0= RULE_STRING )
                    {
                    // InternalDsl.g:545:5: (lv_name_35_0= RULE_STRING )
                    // InternalDsl.g:546:6: lv_name_35_0= RULE_STRING
                    {
                    lv_name_35_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(lv_name_35_0, grammarAccess.getScenarioTypeAndParticipantsAccess().getNameSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getScenarioTypeAndParticipantsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_35_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_36, grammarAccess.getScenarioTypeAndParticipantsAccess().getLeftCurlyBracketKeyword_6_2());
                    			
                    // InternalDsl.g:566:4: ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==23||(LA16_0>=32 && LA16_0<=33)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDsl.g:567:5: ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) )
                    	    {
                    	    // InternalDsl.g:567:5: ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) )
                    	    // InternalDsl.g:568:6: (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole )
                    	    {
                    	    // InternalDsl.g:568:6: (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole )
                    	    int alt15=3;
                    	    switch ( input.LA(1) ) {
                    	    case 32:
                    	        {
                    	        alt15=1;
                    	        }
                    	        break;
                    	    case 23:
                    	        {
                    	        alt15=2;
                    	        }
                    	        break;
                    	    case 33:
                    	        {
                    	        alt15=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt15) {
                    	        case 1 :
                    	            // InternalDsl.g:569:7: lv_participants_37_1= ruleEntity
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsEntityParserRuleCall_6_3_0_0());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_37_1=ruleEntity();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_37_1,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Entity");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalDsl.g:585:7: lv_participants_37_2= ruleActor
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsActorParserRuleCall_6_3_0_1());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_37_2=ruleActor();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_37_2,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Actor");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalDsl.g:601:7: lv_participants_37_3= ruleRole
                    	            {

                    	            							newCompositeNode(grammarAccess.getScenarioTypeAndParticipantsAccess().getParticipantsRoleParserRuleCall_6_3_0_2());
                    	            						
                    	            pushFollow(FOLLOW_15);
                    	            lv_participants_37_3=ruleRole();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getScenarioTypeAndParticipantsRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"participants",
                    	            								lv_participants_37_3,
                    	            								"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Role");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenarioTypeAndParticipants"


    // $ANTLR start "entryRuleActor"
    // InternalDsl.g:624:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalDsl.g:624:46: (iv_ruleActor= ruleActor EOF )
            // InternalDsl.g:625:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalDsl.g:631:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:637:2: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:638:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:638:2: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:639:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
            		
            // InternalDsl.g:643:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:644:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:644:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:645:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActorAccess().getAsKeyword_2());
            		
            // InternalDsl.g:665:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:666:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:666:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:667:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:687:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:687:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:688:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:694:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:700:2: ( (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:701:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:701:2: (otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:702:3: otherlv_0= 'component' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalDsl.g:706:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:707:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:707:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:708:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getAsKeyword_2());
            		
            // InternalDsl.g:728:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:729:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:729:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:730:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getComponentAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRulePhysicalComponent"
    // InternalDsl.g:750:1: entryRulePhysicalComponent returns [EObject current=null] : iv_rulePhysicalComponent= rulePhysicalComponent EOF ;
    public final EObject entryRulePhysicalComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhysicalComponent = null;


        try {
            // InternalDsl.g:750:58: (iv_rulePhysicalComponent= rulePhysicalComponent EOF )
            // InternalDsl.g:751:2: iv_rulePhysicalComponent= rulePhysicalComponent EOF
            {
             newCompositeNode(grammarAccess.getPhysicalComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhysicalComponent=rulePhysicalComponent();

            state._fsp--;

             current =iv_rulePhysicalComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhysicalComponent"


    // $ANTLR start "rulePhysicalComponent"
    // InternalDsl.g:757:1: rulePhysicalComponent returns [EObject current=null] : ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? ) ;
    public final EObject rulePhysicalComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_component_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:763:2: ( ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? ) )
            // InternalDsl.g:764:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? )
            {
            // InternalDsl.g:764:2: ( ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )? )
            // InternalDsl.g:765:3: ( (lv_component_0_0= ruleComponent ) ) (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )?
            {
            // InternalDsl.g:765:3: ( (lv_component_0_0= ruleComponent ) )
            // InternalDsl.g:766:4: (lv_component_0_0= ruleComponent )
            {
            // InternalDsl.g:766:4: (lv_component_0_0= ruleComponent )
            // InternalDsl.g:767:5: lv_component_0_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getPhysicalComponentAccess().getComponentComponentParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_component_0_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhysicalComponentRule());
            					}
            					set(
            						current,
            						"component",
            						lv_component_0_0,
            						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:784:3: (otherlv_1= 'unset' | otherlv_2= 'behavior' | otherlv_3= 'node' )?
            int alt18=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt18=1;
                    }
                    break;
                case 27:
                    {
                    alt18=2;
                    }
                    break;
                case 28:
                    {
                    alt18=3;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // InternalDsl.g:785:4: otherlv_1= 'unset'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPhysicalComponentAccess().getUnsetKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:790:4: otherlv_2= 'behavior'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPhysicalComponentAccess().getBehaviorKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDsl.g:795:4: otherlv_3= 'node'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPhysicalComponentAccess().getNodeKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhysicalComponent"


    // $ANTLR start "entryRuleConfigurationItem"
    // InternalDsl.g:804:1: entryRuleConfigurationItem returns [EObject current=null] : iv_ruleConfigurationItem= ruleConfigurationItem EOF ;
    public final EObject entryRuleConfigurationItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfigurationItem = null;


        try {
            // InternalDsl.g:804:58: (iv_ruleConfigurationItem= ruleConfigurationItem EOF )
            // InternalDsl.g:805:2: iv_ruleConfigurationItem= ruleConfigurationItem EOF
            {
             newCompositeNode(grammarAccess.getConfigurationItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfigurationItem=ruleConfigurationItem();

            state._fsp--;

             current =iv_ruleConfigurationItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfigurationItem"


    // $ANTLR start "ruleConfigurationItem"
    // InternalDsl.g:811:1: ruleConfigurationItem returns [EObject current=null] : (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleConfigurationItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:817:2: ( (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:818:2: (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:818:2: (otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:819:3: otherlv_0= 'configuration_item' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationItemAccess().getConfiguration_itemKeyword_0());
            		
            // InternalDsl.g:823:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:824:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:824:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:825:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationItemAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigurationItemAccess().getAsKeyword_2());
            		
            // InternalDsl.g:845:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:846:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:846:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:847:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getConfigurationItemAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationItemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfigurationItem"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:867:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalDsl.g:867:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalDsl.g:868:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:874:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:880:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:881:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:881:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:882:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalDsl.g:886:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:887:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:887:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:888:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getAsKeyword_2());
            		
            // InternalDsl.g:908:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:909:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:909:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:910:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getFunctionAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleActivity"
    // InternalDsl.g:930:1: entryRuleActivity returns [EObject current=null] : iv_ruleActivity= ruleActivity EOF ;
    public final EObject entryRuleActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActivity = null;


        try {
            // InternalDsl.g:930:49: (iv_ruleActivity= ruleActivity EOF )
            // InternalDsl.g:931:2: iv_ruleActivity= ruleActivity EOF
            {
             newCompositeNode(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActivity=ruleActivity();

            state._fsp--;

             current =iv_ruleActivity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalDsl.g:937:1: ruleActivity returns [EObject current=null] : (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:943:2: ( (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:944:2: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:944:2: (otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:945:3: otherlv_0= 'activity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getActivityAccess().getActivityKeyword_0());
            		
            // InternalDsl.g:949:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:950:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:950:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:951:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getActivityAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getActivityAccess().getAsKeyword_2());
            		
            // InternalDsl.g:971:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:972:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:972:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:973:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getActivityAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActivityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleEntity"
    // InternalDsl.g:993:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDsl.g:993:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDsl.g:994:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDsl.g:1000:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1006:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:1007:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:1007:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:1008:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalDsl.g:1012:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:1013:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:1013:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:1014:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getAsKeyword_2());
            		
            // InternalDsl.g:1034:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:1035:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:1035:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:1036:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getEntityAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleRole"
    // InternalDsl.g:1056:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalDsl.g:1056:45: (iv_ruleRole= ruleRole EOF )
            // InternalDsl.g:1057:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalDsl.g:1063:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1069:2: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) ) )
            // InternalDsl.g:1070:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            {
            // InternalDsl.g:1070:2: (otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) ) )
            // InternalDsl.g:1071:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalDsl.g:1075:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDsl.g:1076:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDsl.g:1076:4: (lv_name_1_0= RULE_STRING )
            // InternalDsl.g:1077:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getAsKeyword_2());
            		
            // InternalDsl.g:1097:3: ( (lv_id_3_0= RULE_ID ) )
            // InternalDsl.g:1098:4: (lv_id_3_0= RULE_ID )
            {
            // InternalDsl.g:1098:4: (lv_id_3_0= RULE_ID )
            // InternalDsl.g:1099:5: lv_id_3_0= RULE_ID
            {
            lv_id_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_id_3_0, grammarAccess.getRoleAccess().getIdIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleMessage"
    // InternalDsl.g:1119:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalDsl.g:1119:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalDsl.g:1120:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalDsl.g:1126:1: ruleMessage returns [EObject current=null] : (this_SequenceMessageType_0= ruleSequenceMessageType | this_ArmTimerMessage_1= ruleArmTimerMessage | this_ParticipantDeactivation_2= ruleParticipantDeactivation ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceMessageType_0 = null;

        EObject this_ArmTimerMessage_1 = null;

        EObject this_ParticipantDeactivation_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:1132:2: ( (this_SequenceMessageType_0= ruleSequenceMessageType | this_ArmTimerMessage_1= ruleArmTimerMessage | this_ParticipantDeactivation_2= ruleParticipantDeactivation ) )
            // InternalDsl.g:1133:2: (this_SequenceMessageType_0= ruleSequenceMessageType | this_ArmTimerMessage_1= ruleArmTimerMessage | this_ParticipantDeactivation_2= ruleParticipantDeactivation )
            {
            // InternalDsl.g:1133:2: (this_SequenceMessageType_0= ruleSequenceMessageType | this_ArmTimerMessage_1= ruleArmTimerMessage | this_ParticipantDeactivation_2= ruleParticipantDeactivation )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case 39:
                {
                alt19=2;
                }
                break;
            case 40:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1134:3: this_SequenceMessageType_0= ruleSequenceMessageType
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getSequenceMessageTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceMessageType_0=ruleSequenceMessageType();

                    state._fsp--;


                    			current = this_SequenceMessageType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1143:3: this_ArmTimerMessage_1= ruleArmTimerMessage
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getArmTimerMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArmTimerMessage_1=ruleArmTimerMessage();

                    state._fsp--;


                    			current = this_ArmTimerMessage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1152:3: this_ParticipantDeactivation_2= ruleParticipantDeactivation
                    {

                    			newCompositeNode(grammarAccess.getMessageAccess().getParticipantDeactivationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParticipantDeactivation_2=ruleParticipantDeactivation();

                    state._fsp--;


                    			current = this_ParticipantDeactivation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleSequenceMessageType"
    // InternalDsl.g:1164:1: entryRuleSequenceMessageType returns [EObject current=null] : iv_ruleSequenceMessageType= ruleSequenceMessageType EOF ;
    public final EObject entryRuleSequenceMessageType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceMessageType = null;


        try {
            // InternalDsl.g:1164:60: (iv_ruleSequenceMessageType= ruleSequenceMessageType EOF )
            // InternalDsl.g:1165:2: iv_ruleSequenceMessageType= ruleSequenceMessageType EOF
            {
             newCompositeNode(grammarAccess.getSequenceMessageTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceMessageType=ruleSequenceMessageType();

            state._fsp--;

             current =iv_ruleSequenceMessageType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceMessageType"


    // $ANTLR start "ruleSequenceMessageType"
    // InternalDsl.g:1171:1: ruleSequenceMessageType returns [EObject current=null] : ( (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage ) ( (lv_return_3_0= ruleReturnMessage ) )? ) ;
    public final EObject ruleSequenceMessageType() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceMessage_0 = null;

        EObject this_CreateMessage_1 = null;

        EObject this_DeleteMessage_2 = null;

        EObject lv_return_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1177:2: ( ( (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage ) ( (lv_return_3_0= ruleReturnMessage ) )? ) )
            // InternalDsl.g:1178:2: ( (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage ) ( (lv_return_3_0= ruleReturnMessage ) )? )
            {
            // InternalDsl.g:1178:2: ( (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage ) ( (lv_return_3_0= ruleReturnMessage ) )? )
            // InternalDsl.g:1179:3: (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage ) ( (lv_return_3_0= ruleReturnMessage ) )?
            {
            // InternalDsl.g:1179:3: (this_SequenceMessage_0= ruleSequenceMessage | this_CreateMessage_1= ruleCreateMessage | this_DeleteMessage_2= ruleDeleteMessage )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 34:
                    {
                    alt20=1;
                    }
                    break;
                case 36:
                    {
                    alt20=2;
                    }
                    break;
                case 37:
                    {
                    alt20=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1180:4: this_SequenceMessage_0= ruleSequenceMessage
                    {

                    				newCompositeNode(grammarAccess.getSequenceMessageTypeAccess().getSequenceMessageParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_19);
                    this_SequenceMessage_0=ruleSequenceMessage();

                    state._fsp--;


                    				current = this_SequenceMessage_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1189:4: this_CreateMessage_1= ruleCreateMessage
                    {

                    				newCompositeNode(grammarAccess.getSequenceMessageTypeAccess().getCreateMessageParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_CreateMessage_1=ruleCreateMessage();

                    state._fsp--;


                    				current = this_CreateMessage_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1198:4: this_DeleteMessage_2= ruleDeleteMessage
                    {

                    				newCompositeNode(grammarAccess.getSequenceMessageTypeAccess().getDeleteMessageParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_19);
                    this_DeleteMessage_2=ruleDeleteMessage();

                    state._fsp--;


                    				current = this_DeleteMessage_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalDsl.g:1207:3: ( (lv_return_3_0= ruleReturnMessage ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==38) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalDsl.g:1208:4: (lv_return_3_0= ruleReturnMessage )
                    {
                    // InternalDsl.g:1208:4: (lv_return_3_0= ruleReturnMessage )
                    // InternalDsl.g:1209:5: lv_return_3_0= ruleReturnMessage
                    {

                    					newCompositeNode(grammarAccess.getSequenceMessageTypeAccess().getReturnReturnMessageParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_return_3_0=ruleReturnMessage();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSequenceMessageTypeRule());
                    					}
                    					set(
                    						current,
                    						"return",
                    						lv_return_3_0,
                    						"org.polarsys.capella.scenario.editor.dslscenario.Dsl.ReturnMessage");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceMessageType"


    // $ANTLR start "entryRuleSequenceMessage"
    // InternalDsl.g:1230:1: entryRuleSequenceMessage returns [EObject current=null] : iv_ruleSequenceMessage= ruleSequenceMessage EOF ;
    public final EObject entryRuleSequenceMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceMessage = null;


        try {
            // InternalDsl.g:1230:56: (iv_ruleSequenceMessage= ruleSequenceMessage EOF )
            // InternalDsl.g:1231:2: iv_ruleSequenceMessage= ruleSequenceMessage EOF
            {
             newCompositeNode(grammarAccess.getSequenceMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceMessage=ruleSequenceMessage();

            state._fsp--;

             current =iv_ruleSequenceMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceMessage"


    // $ANTLR start "ruleSequenceMessage"
    // InternalDsl.g:1237:1: ruleSequenceMessage returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSequenceMessage() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1243:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1244:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1244:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:1245:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:1245:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalDsl.g:1246:4: (lv_source_0_0= RULE_ID )
            {
            // InternalDsl.g:1246:4: (lv_source_0_0= RULE_ID )
            // InternalDsl.g:1247:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_source_0_0, grammarAccess.getSequenceMessageAccess().getSourceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceMessageAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalDsl.g:1267:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalDsl.g:1268:4: (lv_target_2_0= RULE_ID )
            {
            // InternalDsl.g:1268:4: (lv_target_2_0= RULE_ID )
            // InternalDsl.g:1269:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_target_2_0, grammarAccess.getSequenceMessageAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceMessageAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1289:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:1290:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:1290:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:1291:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getSequenceMessageAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceMessage"


    // $ANTLR start "entryRuleCreateMessage"
    // InternalDsl.g:1311:1: entryRuleCreateMessage returns [EObject current=null] : iv_ruleCreateMessage= ruleCreateMessage EOF ;
    public final EObject entryRuleCreateMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateMessage = null;


        try {
            // InternalDsl.g:1311:54: (iv_ruleCreateMessage= ruleCreateMessage EOF )
            // InternalDsl.g:1312:2: iv_ruleCreateMessage= ruleCreateMessage EOF
            {
             newCompositeNode(grammarAccess.getCreateMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateMessage=ruleCreateMessage();

            state._fsp--;

             current =iv_ruleCreateMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateMessage"


    // $ANTLR start "ruleCreateMessage"
    // InternalDsl.g:1318:1: ruleCreateMessage returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->+' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleCreateMessage() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1324:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->+' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1325:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->+' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1325:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->+' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:1326:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->+' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:1326:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalDsl.g:1327:4: (lv_source_0_0= RULE_ID )
            {
            // InternalDsl.g:1327:4: (lv_source_0_0= RULE_ID )
            // InternalDsl.g:1328:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_source_0_0, grammarAccess.getCreateMessageAccess().getSourceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateMessageAccess().getHyphenMinusGreaterThanSignPlusSignKeyword_1());
            		
            // InternalDsl.g:1348:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalDsl.g:1349:4: (lv_target_2_0= RULE_ID )
            {
            // InternalDsl.g:1349:4: (lv_target_2_0= RULE_ID )
            // InternalDsl.g:1350:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_target_2_0, grammarAccess.getCreateMessageAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateMessageAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1370:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:1371:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:1371:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:1372:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getCreateMessageAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreateMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateMessage"


    // $ANTLR start "entryRuleDeleteMessage"
    // InternalDsl.g:1392:1: entryRuleDeleteMessage returns [EObject current=null] : iv_ruleDeleteMessage= ruleDeleteMessage EOF ;
    public final EObject entryRuleDeleteMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMessage = null;


        try {
            // InternalDsl.g:1392:54: (iv_ruleDeleteMessage= ruleDeleteMessage EOF )
            // InternalDsl.g:1393:2: iv_ruleDeleteMessage= ruleDeleteMessage EOF
            {
             newCompositeNode(grammarAccess.getDeleteMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteMessage=ruleDeleteMessage();

            state._fsp--;

             current =iv_ruleDeleteMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteMessage"


    // $ANTLR start "ruleDeleteMessage"
    // InternalDsl.g:1399:1: ruleDeleteMessage returns [EObject current=null] : ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->x' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleDeleteMessage() throws RecognitionException {
        EObject current = null;

        Token lv_source_0_0=null;
        Token otherlv_1=null;
        Token lv_target_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1405:2: ( ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->x' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1406:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->x' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1406:2: ( ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->x' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:1407:3: ( (lv_source_0_0= RULE_ID ) ) otherlv_1= '->x' ( (lv_target_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:1407:3: ( (lv_source_0_0= RULE_ID ) )
            // InternalDsl.g:1408:4: (lv_source_0_0= RULE_ID )
            {
            // InternalDsl.g:1408:4: (lv_source_0_0= RULE_ID )
            // InternalDsl.g:1409:5: lv_source_0_0= RULE_ID
            {
            lv_source_0_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_source_0_0, grammarAccess.getDeleteMessageAccess().getSourceIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMessageAccess().getXKeyword_1());
            		
            // InternalDsl.g:1429:3: ( (lv_target_2_0= RULE_ID ) )
            // InternalDsl.g:1430:4: (lv_target_2_0= RULE_ID )
            {
            // InternalDsl.g:1430:4: (lv_target_2_0= RULE_ID )
            // InternalDsl.g:1431:5: lv_target_2_0= RULE_ID
            {
            lv_target_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_target_2_0, grammarAccess.getDeleteMessageAccess().getTargetIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteMessageAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1451:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:1452:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:1452:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:1453:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getDeleteMessageAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeleteMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteMessage"


    // $ANTLR start "entryRuleReturnMessage"
    // InternalDsl.g:1473:1: entryRuleReturnMessage returns [EObject current=null] : iv_ruleReturnMessage= ruleReturnMessage EOF ;
    public final EObject entryRuleReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnMessage = null;


        try {
            // InternalDsl.g:1473:54: (iv_ruleReturnMessage= ruleReturnMessage EOF )
            // InternalDsl.g:1474:2: iv_ruleReturnMessage= ruleReturnMessage EOF
            {
             newCompositeNode(grammarAccess.getReturnMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnMessage=ruleReturnMessage();

            state._fsp--;

             current =iv_ruleReturnMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnMessage"


    // $ANTLR start "ruleReturnMessage"
    // InternalDsl.g:1480:1: ruleReturnMessage returns [EObject current=null] : ( ( (lv_target_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_source_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleReturnMessage() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;
        Token otherlv_1=null;
        Token lv_source_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1486:2: ( ( ( (lv_target_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_source_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1487:2: ( ( (lv_target_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_source_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1487:2: ( ( (lv_target_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_source_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) ) )
            // InternalDsl.g:1488:3: ( (lv_target_0_0= RULE_ID ) ) otherlv_1= '<--' ( (lv_source_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_name_4_0= RULE_STRING ) )
            {
            // InternalDsl.g:1488:3: ( (lv_target_0_0= RULE_ID ) )
            // InternalDsl.g:1489:4: (lv_target_0_0= RULE_ID )
            {
            // InternalDsl.g:1489:4: (lv_target_0_0= RULE_ID )
            // InternalDsl.g:1490:5: lv_target_0_0= RULE_ID
            {
            lv_target_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_target_0_0, grammarAccess.getReturnMessageAccess().getTargetIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"target",
            						lv_target_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnMessageAccess().getLessThanSignHyphenMinusHyphenMinusKeyword_1());
            		
            // InternalDsl.g:1510:3: ( (lv_source_2_0= RULE_ID ) )
            // InternalDsl.g:1511:4: (lv_source_2_0= RULE_ID )
            {
            // InternalDsl.g:1511:4: (lv_source_2_0= RULE_ID )
            // InternalDsl.g:1512:5: lv_source_2_0= RULE_ID
            {
            lv_source_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_source_2_0, grammarAccess.getReturnMessageAccess().getSourceIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getReturnMessageAccess().getColonKeyword_3());
            		
            // InternalDsl.g:1532:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalDsl.g:1533:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalDsl.g:1533:4: (lv_name_4_0= RULE_STRING )
            // InternalDsl.g:1534:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_4_0, grammarAccess.getReturnMessageAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnMessage"


    // $ANTLR start "entryRuleArmTimerMessage"
    // InternalDsl.g:1554:1: entryRuleArmTimerMessage returns [EObject current=null] : iv_ruleArmTimerMessage= ruleArmTimerMessage EOF ;
    public final EObject entryRuleArmTimerMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArmTimerMessage = null;


        try {
            // InternalDsl.g:1554:56: (iv_ruleArmTimerMessage= ruleArmTimerMessage EOF )
            // InternalDsl.g:1555:2: iv_ruleArmTimerMessage= ruleArmTimerMessage EOF
            {
             newCompositeNode(grammarAccess.getArmTimerMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArmTimerMessage=ruleArmTimerMessage();

            state._fsp--;

             current =iv_ruleArmTimerMessage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArmTimerMessage"


    // $ANTLR start "ruleArmTimerMessage"
    // InternalDsl.g:1561:1: ruleArmTimerMessage returns [EObject current=null] : (otherlv_0= '->>' ( (lv_participant_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleArmTimerMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_participant_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1567:2: ( (otherlv_0= '->>' ( (lv_participant_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1568:2: (otherlv_0= '->>' ( (lv_participant_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1568:2: (otherlv_0= '->>' ( (lv_participant_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalDsl.g:1569:3: otherlv_0= '->>' ( (lv_participant_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getArmTimerMessageAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_0());
            		
            // InternalDsl.g:1573:3: ( (lv_participant_1_0= RULE_ID ) )
            // InternalDsl.g:1574:4: (lv_participant_1_0= RULE_ID )
            {
            // InternalDsl.g:1574:4: (lv_participant_1_0= RULE_ID )
            // InternalDsl.g:1575:5: lv_participant_1_0= RULE_ID
            {
            lv_participant_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_participant_1_0, grammarAccess.getArmTimerMessageAccess().getParticipantIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArmTimerMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"participant",
            						lv_participant_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getArmTimerMessageAccess().getColonKeyword_2());
            		
            // InternalDsl.g:1595:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:1596:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:1596:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:1597:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getArmTimerMessageAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArmTimerMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArmTimerMessage"


    // $ANTLR start "entryRuleParticipantDeactivation"
    // InternalDsl.g:1617:1: entryRuleParticipantDeactivation returns [EObject current=null] : iv_ruleParticipantDeactivation= ruleParticipantDeactivation EOF ;
    public final EObject entryRuleParticipantDeactivation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParticipantDeactivation = null;


        try {
            // InternalDsl.g:1617:64: (iv_ruleParticipantDeactivation= ruleParticipantDeactivation EOF )
            // InternalDsl.g:1618:2: iv_ruleParticipantDeactivation= ruleParticipantDeactivation EOF
            {
             newCompositeNode(grammarAccess.getParticipantDeactivationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParticipantDeactivation=ruleParticipantDeactivation();

            state._fsp--;

             current =iv_ruleParticipantDeactivation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParticipantDeactivation"


    // $ANTLR start "ruleParticipantDeactivation"
    // InternalDsl.g:1624:1: ruleParticipantDeactivation returns [EObject current=null] : (otherlv_0= 'deactivate' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParticipantDeactivation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1630:2: ( (otherlv_0= 'deactivate' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDsl.g:1631:2: (otherlv_0= 'deactivate' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDsl.g:1631:2: (otherlv_0= 'deactivate' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDsl.g:1632:3: otherlv_0= 'deactivate' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParticipantDeactivationAccess().getDeactivateKeyword_0());
            		
            // InternalDsl.g:1636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:1637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:1637:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:1638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParticipantDeactivationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParticipantDeactivationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParticipantDeactivation"


    // $ANTLR start "entryRuleReference"
    // InternalDsl.g:1658:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDsl.g:1658:50: (iv_ruleReference= ruleReference EOF )
            // InternalDsl.g:1659:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDsl.g:1665:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' otherlv_1= 'over' ( (lv_timelines_2_0= RULE_ID ) )+ ( (lv_name_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_timelines_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1671:2: ( (otherlv_0= 'ref' otherlv_1= 'over' ( (lv_timelines_2_0= RULE_ID ) )+ ( (lv_name_3_0= RULE_STRING ) ) ) )
            // InternalDsl.g:1672:2: (otherlv_0= 'ref' otherlv_1= 'over' ( (lv_timelines_2_0= RULE_ID ) )+ ( (lv_name_3_0= RULE_STRING ) ) )
            {
            // InternalDsl.g:1672:2: (otherlv_0= 'ref' otherlv_1= 'over' ( (lv_timelines_2_0= RULE_ID ) )+ ( (lv_name_3_0= RULE_STRING ) ) )
            // InternalDsl.g:1673:3: otherlv_0= 'ref' otherlv_1= 'over' ( (lv_timelines_2_0= RULE_ID ) )+ ( (lv_name_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getOverKeyword_1());
            		
            // InternalDsl.g:1681:3: ( (lv_timelines_2_0= RULE_ID ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1682:4: (lv_timelines_2_0= RULE_ID )
            	    {
            	    // InternalDsl.g:1682:4: (lv_timelines_2_0= RULE_ID )
            	    // InternalDsl.g:1683:5: lv_timelines_2_0= RULE_ID
            	    {
            	    lv_timelines_2_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            	    					newLeafNode(lv_timelines_2_0, grammarAccess.getReferenceAccess().getTimelinesIDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getReferenceRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"timelines",
            	    						lv_timelines_2_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // InternalDsl.g:1699:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalDsl.g:1700:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalDsl.g:1700:4: (lv_name_3_0= RULE_STRING )
            // InternalDsl.g:1701:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_3_0, grammarAccess.getReferenceAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\15\3\16\7\uffff";
    static final String dfa_3s = "\1\26\3\23\7\uffff";
    static final String dfa_4s = "\4\uffff\1\5\1\6\1\7\1\4\1\1\1\2\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6",
            "\2\10\3\uffff\1\7",
            "\2\11\3\uffff\1\7",
            "\2\12\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "161:2: ( (otherlv_0= 'System' (otherlv_1= 'IS' | otherlv_2= 'ES' ) ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= '{' ( (lv_participants_5_0= ruleActor ) )* ) | (otherlv_6= 'Logical' (otherlv_7= 'IS' | otherlv_8= 'ES' ) ( (lv_name_9_0= RULE_STRING ) ) otherlv_10= '{' ( ( (lv_participants_11_1= ruleActor | lv_participants_11_2= ruleComponent ) ) )* ) | (otherlv_12= 'Physical' (otherlv_13= 'IS' | otherlv_14= 'ES' ) ( (lv_name_15_0= RULE_STRING ) ) otherlv_16= '{' ( ( (lv_participant_17_1= ruleActor | lv_participant_17_2= rulePhysicalComponent ) ) )* ) | ( (otherlv_18= 'System' | otherlv_19= 'Logical' | otherlv_20= 'Physical' ) otherlv_21= 'FS' ( (lv_name_22_0= RULE_STRING ) ) otherlv_23= '{' ( (lv_participants_24_0= ruleFunction ) )* ) | (otherlv_25= 'EPBS' otherlv_26= 'IS' ( (lv_name_27_0= RULE_STRING ) ) otherlv_28= '{' ( (lv_participants_29_0= ruleConfigurationItem ) )* ) | (otherlv_30= 'OAS' ( (lv_name_31_0= RULE_STRING ) ) otherlv_32= '{' ( (lv_participants_33_0= ruleActivity ) )* ) | (otherlv_34= 'OES' ( (lv_name_35_0= RULE_STRING ) ) otherlv_36= '{' ( ( (lv_participants_37_1= ruleEntity | lv_participants_37_2= ruleActor | lv_participants_37_3= ruleRole ) ) )* ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000762000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000038000001020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000300800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});

}