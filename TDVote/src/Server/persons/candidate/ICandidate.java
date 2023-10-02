package Server.persons.candidate;

import Server.persons.candidate.Candidate;

import java.rmi.RemoteException;
import java.util.List;

public interface ICandidate {
    public List<Candidate> getCandidateList() throws RemoteException;
}
